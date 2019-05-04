package com.example.rabbitmq.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: gaojun
 * @date: 2019/4/30 15:59
 * @description: mq消费者
 */
@Component
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

//    @RabbitListener(queues = RabbitmqConfig.QUEUE_A)
//    @RabbitHandler
    public void process(String content) {
        logger.info("接收处理队列A当中的消息:{}", content);
    }

}
