package com.example.demo.task;

import com.example.demo.dto.TaskDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author: zw.wen
 */
@Component
@Slf4j
public class TaskFactory {

    @Async
    public Future doTask(TaskDTO taskDTO) throws InterruptedException{
        return new AsyncResult<>("Task-" + taskDTO.getTaskId() +" accomplished!");
    }}
