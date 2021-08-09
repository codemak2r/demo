package com.example.demo.websocket;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zw.wen
 */
@Slf4j
@ServerEndpoint("/ws/{taskId}")
@Component
public class WebSocketServer {
    private static ConcurrentHashMap<String, WebSocketServer> concurrentHashMap = new ConcurrentHashMap();
    private Session session;
    private String taskId;

    /**
     * 发送消息到客户端
     * @param msg
     * @throws IOException
     */
    public void sendMessage(String msg) throws IOException {
        synchronized(this.session) {
            this.session.getBasicRemote().sendText(msg);
        }
    }

    /**
     * 打开 sockets 连接
     * @param session
     * @param taskId
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("taskId") String taskId) {
        this.session = session;
        this.taskId = taskId;
        if(concurrentHashMap.contains(taskId)) {
            concurrentHashMap.remove(taskId);
            concurrentHashMap.put(taskId, this);
        }else{
            concurrentHashMap.put(taskId, this);
        }

//        try{
//            sendMessage("开始执行任务=================");
//        }catch (IOException e) {
//            log.error("【Socket】连接失败, taskId:" + this.taskId);
//            log.error(e.getMessage());
//        }
    }

    /**
     * 关闭 socket 连接， 并且清除 taskId 所保存的对象
     */
    @OnClose
    public void onClose(){
        if(concurrentHashMap.contains(this.taskId)){
            concurrentHashMap.remove(this.taskId);
        }
    }

    /**
     * 发生错误的时候，记录log
     * @param session
     * @param exception
     */
    @OnError
    public void onError(Session session, Throwable exception){
        log.error("发生错误, taskId:" + this.taskId);
        log.error("错误原因：" + exception.getMessage());
    }

    /**
     * 用于接收客户端传过来的消息，并进行处理
     * @param msg
     * @param session
     */
    @OnMessage
    public void onMessage(String msg, Session session){

    }

    public ConcurrentHashMap getWebSocketMap(){
        return concurrentHashMap;
    }
}
