package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: zw.wen
 */
@Order(1)
@Aspect
@Component
@Slf4j
public class CatchExceptionAspect {
    @Pointcut("@annotation(com.example.demo.annotation.CatchException)")
    public void pointCut() {}
}
