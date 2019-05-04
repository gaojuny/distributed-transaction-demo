package com.example.rabbitmq.config;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.UUID;

/**
 * @author: gaojun
 * @date: 2019/4/30 15:40
 * @description: mq生产者
 */
@Component
public class Producer<T> implements RabbitTemplate.ConfirmCallback {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public Producer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        rabbitTemplate.setConfirmCallback(this);
    }

    /**
     * 异步发送消息
     * @param content
     * @return
     */
    public boolean sendMsgAsync(String content) {
        try {
            CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
            rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_A, RabbitmqConfig.ROUTINGKEY_A,
                    content, correlationId);
        }catch (Exception e){
            logger.error("发送消息失败", e);
            return false;
        }
        return true;
    }

    /**
     * 同步发送消息
     * @param content
     * @return
     */
    public T sendMsgSync(String content) {
        try {
            CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
            return rabbitTemplate.convertSendAndReceiveAsType(RabbitmqConfig.EXCHANGE_A, RabbitmqConfig.ROUTINGKEY_A,
                    content, correlationId, new ParameterizedTypeReference<T>() {
                    });
        }catch (Exception e){
            logger.error("发送消息失败", e);
        }
        return null;
    }

    /**
     * 消费完成回调方法
     * @param correlationData
     * @param b
     * @param s
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        logger.info("回调id:" + correlationData);
        //b = ack
        if (b) {
            logger.info("消息成功消费");
        } else {
            logger.info("消息消费失败{}", s);
        }
    }
}
