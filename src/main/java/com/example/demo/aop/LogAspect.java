package com.example.demo.aop;

import com.example.demo.dto.TaskDTO;
import javafx.concurrent.Task;
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
    @Pointcut("@annotation(com.example.demo.aop.annotation.LogMessage)")
    public void pointCut() {}

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        TaskDTO taskDTO = (TaskDTO) joinPoint.getArgs()[0];
        MDC.put("taskId", taskDTO.getTaskId());
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        //方法执行完成以后，删除traceId
        MDC.remove("traceId");
    }
}
