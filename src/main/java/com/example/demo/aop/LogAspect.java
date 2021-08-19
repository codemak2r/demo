package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: zw.wen
 */
@Order(1)
@Aspect
@Component
@Slf4j
public class LogAspect {
    @Pointcut("@annotation(com.example.demo.annotation.LogMessage)")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {

    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        //方法执行完成以后，删除traceId
        MDC.remove("traceId");
    }
}
