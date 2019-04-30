package com.example.distributed.transaction.service.impl;

import com.example.distributed.transaction.dao.TMqMessageDao;
import com.example.distributed.transaction.dao.UserDao;
import com.example.distributed.transaction.model.User;
import com.example.distributed.transaction.model.UserExample;
import com.example.distributed.transaction.service.UserService;
import com.example.rabbitmq.config.Producer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: gaojun
 * @date: 2019/4/30 17:40
 * @description:
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserServiceImpl implements UserService {
    @Resource
    private Producer producer;
    @Resource
    private TMqMessageDao mqMessageDao;
    @Resource
    private UserDao userDao;

    @Override
    public void save(UserExample user) {

    }
}
