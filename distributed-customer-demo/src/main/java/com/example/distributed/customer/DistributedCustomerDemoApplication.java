package com.example.distributed.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.rabbitmq.config",
        "com.example.distributed.customer.*"})
public class DistributedCustomerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedCustomerDemoApplication.class, args);
    }

}
