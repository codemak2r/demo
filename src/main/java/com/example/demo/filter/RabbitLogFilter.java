package com.example.demo.filter;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.AbstractMatcherFilter;
import ch.qos.logback.core.spi.FilterReply;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author: zw.wen
 */
@Slf4j
public class RabbitLogFilter extends AbstractMatcherFilter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {

        // 如果还没启动， 那么日志传递到下一个过滤器进行处理。 中性
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }

        Map<String, String> mdcMap = iLoggingEvent.getMDCPropertyMap();
        String traceId = mdcMap.get("taskId");
        if (!traceId.isEmpty()) {
            return FilterReply.ACCEPT;
        }

        return FilterReply.DENY;
    }
}
