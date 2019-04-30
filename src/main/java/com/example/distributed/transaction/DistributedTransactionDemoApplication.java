package com.example.distributed.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.distributed.transaction", "com.example.rabbitmq.config"})
public class DistributedTransactionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedTransactionDemoApplication.class, args);
    }

}
