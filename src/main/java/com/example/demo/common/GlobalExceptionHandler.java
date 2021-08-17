package com.example.demo.common;

/**
 * @author: zw.wen
 */

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public GlobalResult<String> exceptionHandler(Exception e) {
        return GlobalResult.error();
    }
}