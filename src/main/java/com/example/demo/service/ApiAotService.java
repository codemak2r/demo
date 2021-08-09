package com.example.demo.service;

import com.example.demo.dto.TaskDTO;
import com.example.demo.model.Testcase;

import java.util.List;

/**
 * @author: zw.wen
 */
public interface ApiAotService {
    void runCase(TaskDTO taskDTO);
    void cancellCase(String taskId);
    List<Testcase> queryList();
}
