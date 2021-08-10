package com.example.demo.service.impl;

import com.example.demo.annotation.LogMessage;
import com.example.demo.service.RpcAotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: zw.wen
 */
@Slf4j
@Service
public class RpcAotServiceImpl implements RpcAotService {

    @Override
    @Async("executor")
    @LogMessage
    public int runCase() {
        try {
            Thread.sleep(3000);
            log.info("doing something.....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
