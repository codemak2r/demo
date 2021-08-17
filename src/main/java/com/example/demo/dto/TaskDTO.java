package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: zw.wen
 */

@Getter
@Setter
public class TaskDTO {
    private String taskId;
    private boolean isRunning;

    public TaskDTO(String taskId) {
        this.taskId = taskId;
    }
}
