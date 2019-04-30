package com.example.rabbitmq.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author: gaojun
 * @date: 2019/4/30 15:29
 * @description: rabbitmq配置
 */
@Configuration
public class RabbitmqConfig {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.port}")
    private int port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;


    public static final String EXCHANGE_A = "my-mq-exchange_A";
    public static final String EXCHANGE_B = "my-mq-exchange_B";
    public static final String EXCHANGE_C = "my-mq-exchange_C";


    public static final String QUEUE_A = "QUEUE_A";
    public static final String QUEUE_B = "QUEUE_B";
    public static final String QUEUE_C = "QUEUE_C";

    public static final String ROUTINGKEY_A = "spring-boot-routingKey_A";
    public static final String ROUTINGKEY_B = "spring-boot-routingKey_B";
    public static final String ROUTINGKEY_C = "spring-boot-routingKey_C";

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host,port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost("/");
        connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //必须是prototype类型
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        return template;
    }

    @Bean
    public Exchange topicExchange(){
        return ExchangeBuilder.topicExchange(EXCHANGE_A).build();
    }

    @Bean
    public Queue queueA(){
        logger.info("{}创建成功", QUEUE_A);
        return new Queue(QUEUE_A, false);
    }

    @Bean
    public Queue queueB(){
        logger.info("{}创建成功", QUEUE_B);
        return new Queue(QUEUE_B, false);
    }

    @Bean
    public Binding bindingA() {
        logger.info("{}绑定到{},KEY:{}", QUEUE_A, EXCHANGE_A, ROUTINGKEY_A);
        return BindingBuilder.bind(queueA()).to(topicExchange()).with(ROUTINGKEY_A).noargs();
    }

    @Bean
    public Binding bindingB() {
        logger.info("{}绑定到{},KEY:{}", QUEUE_B, EXCHANGE_A, ROUTINGKEY_B);
        return BindingBuilder.bind(queueB()).to(topicExchange()).with(ROUTINGKEY_B).noargs();
    }
}
