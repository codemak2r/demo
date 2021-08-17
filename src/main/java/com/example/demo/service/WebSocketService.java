package com.example.demo.service;

import com.example.demo.websocket.WebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zw.wen
 */
@Service
@Slf4j
public class WebSocketService {
    @Resource
    WebSocketServer webSocketServer;

    public void sendMessage(String taskId, String msg) {
        ConcurrentHashMap<String, WebSocketServer> concurrentHashMap = webSocketServer.getWebSocketMap();
        WebSocketServer webSocketServer = concurrentHashMap.get(taskId);

        try {
            if (webSocketServer != null) {
                webSocketServer.sendMessage(msg);
            } else {
                log.error("【客户端已经退出】");
            }

        } catch (IOException e) {
            log.error("【发送消息异常】" + e.getMessage());
        }


    }
}