package com.example.demo.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zw.wen
 */
@RestController
@RequestMapping("/v1/rpctest")
@Slf4j
@Api(tags = "rpc测试")
public class RpcController {
}
