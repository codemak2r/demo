package com.example.demo.common;

import com.example.demo.annotation.IgnoreAdvice;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author: zw.wen
 */
//@RestControllerAdvice
//public class GlobalResponseHandler implements ResponseBodyAdvice {
//    @Override
//    public boolean supports(MethodParameter methodParameter, Class aClass) {
//        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreAdvice.class)){
//            return false;
//        }
//
//        if (methodParameter.getMethod().isAnnotationPresent(IgnoreAdvice.class)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
//        if(o == null) {
//
//        }
//
//        return null;
//    }
//}
