package com.example.demo.controller;

import com.example.demo.dto.TaskDTO;
import com.example.demo.service.ApiAotService;
import com.example.demo.service.impl.ApiAotServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zw.wen
 */
@RestController
@RequestMapping("/v1/rpctest")
@Slf4j
public class HomeController {
    @Resource
    ApiAotService apiAotService;
    TaskDTO taskDTO;

    @GetMapping("")
    public String home(String taskId){
        taskDTO = new TaskDTO(taskId);
        taskDTO.setRunning(true);
        apiAotService.runCase(taskDTO);
        return "Hello SpringBoot";
    }
    @GetMapping("/cancell")
    public String cancell(String taskId){
        apiAotService.cancellCase(taskId);
        return "cancelled";
    }
}
