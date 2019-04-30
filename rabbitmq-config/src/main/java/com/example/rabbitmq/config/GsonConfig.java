package com.example.rabbitmq.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: gaojun
 * @date: 2019/4/30 17:17
 * @description:
 */
@Configuration
public class GsonConfig {

    @Bean
    public Gson gson(){
        return new Gson();
    }

}
