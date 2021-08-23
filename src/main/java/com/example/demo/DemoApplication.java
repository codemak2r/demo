package com.example.demo;

import com.spring4all.swagger.EnableSwagger2Doc;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@Slf4j
@EnableAsync
@EnableSwagger2Doc
@EnableCaching
public class DemoApplication {

    public static void main(String[] args) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        SpringApplication.run(DemoApplication.class, args);
    }

}
