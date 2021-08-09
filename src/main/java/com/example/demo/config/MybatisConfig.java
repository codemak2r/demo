package com.example.demo.config;
/*
 * @Description:
 * @Date: 2021/4/13
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.example.demo.mappers"})
public class MybatisConfig {
}