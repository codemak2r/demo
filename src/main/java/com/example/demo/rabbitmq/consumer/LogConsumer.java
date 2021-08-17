package com.example.demo.rabbitmq.consumer;

import com.example.demo.service.WebSocketService;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author: zw.wen
 */

@Component
@Slf4j
public class LogConsumer {
    @Resource
    private WebSocketService webSocketService;

    @RabbitHandler
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(name = "${platform.parameter.queueName}", durable = "true"),
                    exchange = @Exchange(name = "${platform.parameter.exhcangeName}",
                            ignoreDeclarationExceptions = "true", durable = "true"),
                    key = "${platform.parameter.bindingKey}"
            ),
            concurrency = "2"
    )
    public void listennerPush(String msg, Channel channel, Message message) throws IOException {
        try {
            log.debug("consumer>>>接收到的消息>>>{}", msg);
            //[1] - 13:15:17.484 - xxxService实现类方法<<<<任务id：1
            msg.split(" - ")[0].trim().replace("[", "").replace("]", "");
            String tracId = msg.substring(0, msg.indexOf(" - ")).trim().replace("[", "").replace("]", "");
            msg = msg.substring(msg.indexOf(" - ") + 3);
            //调用websocket发送日志信息到页面上
            webSocketService.sendMessage(tracId, msg);
        } catch (Exception e) {
            log.error("获取消息失败，异常原因：{}", e.getMessage(), e);
        } finally {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        }
    }
}
