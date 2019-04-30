package com.example.distributed.transaction.service;

import com.example.distributed.transaction.model.UserExample;

/**
 * @author: gaojun
 * @date: 2019/4/30 17:39
 * @description:
 */
public interface UserService {
    void save(UserExample user);
}
