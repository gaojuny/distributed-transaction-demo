package com.example.distributed.transaction.service;

import com.example.rabbitmq.config.User;

/**
 * @author: gaojun
 * @date: 2019/4/30 17:39
 * @description:
 */
public interface UserService {
    void save(User user);
}
