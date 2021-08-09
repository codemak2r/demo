//package com.example.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.ThreadPoolExecutor;
//
///**
// * @author: zw.wen
// */
//@Configuration
//@EnableAsync
//public class AsncyConfig {
//    @Bean
//    public Executor executor(){
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        //核心线程数：线程池创建时候初始化的线程数
//        executor.setCorePoolSize(10);
//        // 最大线程数，线程池最大的线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
//        executor.setMaxPoolSize(20);
//        // 缓冲队列，用于缓冲执行任务的队列
//        executor.setQueueCapacity(500);
//        // 运行线程的空闲时间，超过就会销毁
//        executor.setKeepAliveSeconds(60);
//        // 设置线程名前缀
//        executor.setThreadNamePrefix("Auto-");
//        // 拒绝策略
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
//        executor.initialize();
//        return executor;
//    }
//}
