/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spring.logging;

import ch.qos.logback.classic.AsyncAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.LoggingEnhancer;
import com.google.cloud.logging.logback.LoggingEventEnhancer;
import com.google.cloud.spring.core.DefaultGcpProjectIdProvider;
import com.google.cloud.spring.core.GcpProjectIdProvider;

/**
 * Adds the trace ID and span ID to the logging entry, in its correct format to be displayed in the
 * Logs viewer.
 */
public class TraceIdLoggingEnhancer implements LoggingEnhancer, LoggingEventEnhancer {

  private static final ThreadLocal<String> threadLocalTraceId = new ThreadLocal<>();

  private static final String APP_ENGINE_LABEL_NAME = "appengine.googleapis.com/trace_id";

  private GcpProjectIdProvider projectIdProvider = new DefaultGcpProjectIdProvider();

  private boolean runningOnAppEngine = System.getenv("GAE_INSTANCE") != null;

  /**
   * Sets or removes the current trace ID.
   *
   * @param id current ID or null to unset
   */
  public static void setCurrentTraceId(String id) {
    if (id == null) {
      threadLocalTraceId.remove();
    } else {
      threadLocalTraceId.set(id);
    }
  }

  /**
   * Get the current trace id.
   *
   * @return the trace ID stored through {@link #setCurrentTraceId(String)}
   */
  public static String getCurrentTraceId() {
    return threadLocalTraceId.get();
  }

  /**
   * Set the trace and span ID fields of the log entry to the current one.
   *
   * <p>The current trace ID is either the trace ID stored in the Mapped Diagnostic Context (MDC)
   * under the "X-B3-TraceId" key or, if none set, the current trace ID set by {@link
   * #setCurrentTraceId(String)}. The current span ID is retrieved from the MDC under the
   * "X-B3-SpanId" key, if set.
   *
   * <p>The trace ID is set in the log entry in the "projects/[GCP_PROJECT_ID]/traces/[TRACE_ID]"
   * format, in order to be associated to traces by the Google Cloud Console.
   *
   * <p>If an application is running on Google App Engine, the trace ID is also stored in the
   * "appengine.googleapis.com/trace_id" field, in order to enable log correlation on the logs
   * viewer.
   *
   * @param builder log entry builder
   */
  @Override
  public void enhanceLogEntry(LogEntry.Builder builder) {
    enhanceLogEntry(builder, null);
  }

  /**
   * See: {@link TraceIdLoggingEnhancer#enhanceLogEntry(LogEntry.Builder)} This method adds support
   * for {@link AsyncAppender} when retrieving MDC properties.
   *
   * @param builder log entry builder
   * @param e logging event
   */
  @Override
  public void enhanceLogEntry(LogEntry.Builder builder, ILoggingEvent e) {
    // In order not to duplicate the whole google-cloud-logging-logback LoggingAppender to add
    // the trace ID from the MDC there, we're doing it here.
    // This requires a call to the org.slf4j package.
    String traceId = null;
    String spanId = null;
    if (e != null) {
      // try the logging event MDC first, so it works with AsyncAppender
      traceId = e.getMDCPropertyMap().get(StackdriverTraceConstants.MDC_FIELD_TRACE_ID);
      spanId = e.getMDCPropertyMap().get(StackdriverTraceConstants.MDC_FIELD_SPAN_ID);
    }
    if (traceId == null) {
      // try thread-local MDC
      traceId = org.slf4j.MDC.get(StackdriverTraceConstants.MDC_FIELD_TRACE_ID);
      spanId = org.slf4j.MDC.get(StackdriverTraceConstants.MDC_FIELD_SPAN_ID);
    }
    if (traceId == null) {
      // try our own thread-local
      traceId = getCurrentTraceId();
    }

    if (traceId != null) {
      builder.setTrace(
          StackdriverTraceConstants.composeFullTraceName(
              this.projectIdProvider.getProjectId(), traceId));
      if (this.runningOnAppEngine) {
        builder.addLabel(APP_ENGINE_LABEL_NAME, traceId);
      }
    }
    if (spanId != null) {
      builder.setSpanId(spanId);
    }
  }

  void setProjectIdProvider(GcpProjectIdProvider projectIdProvider) {
    this.projectIdProvider = projectIdProvider;
  }
}
