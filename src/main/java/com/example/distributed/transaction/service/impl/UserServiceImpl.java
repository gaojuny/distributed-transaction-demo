package com.example.distributed.transaction.service.impl;

import com.example.distributed.transaction.dao.TMqMessageDao;
import com.example.distributed.transaction.dao.UserDao;
import com.example.distributed.transaction.service.UserService;
import com.example.rabbitmq.config.Producer;
import com.example.rabbitmq.config.TMqMessage;
import com.example.rabbitmq.config.User;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author: gaojun
 * @date: 2019/4/30 17:40
 * @description:
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserServiceImpl implements UserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private Producer<Boolean> producer;
    @Resource
    private TMqMessageDao mqMessageDao;
    @Resource
    private UserDao userDao;
    @Resource
    private Gson gson;

    @Override
    public void save(User user) {
        try {
            int insert = userDao.insert(user);
            if (insert > 0) {
                //保存成功才发消息
                String userString = gson.toJson(user);
                Boolean sendResult = producer.sendMsgSync(userString);
                if (sendResult) {
                    TMqMessage mqMessage = new TMqMessage();
                    mqMessage.setMsg(userString);
                    mqMessage.setBizId(UUID.randomUUID().timestamp());
                    mqMessage.setBizType((byte) 1);
                    mqMessage.setMsgDesc("保存用户");
                    mqMessage.setMsgResult((byte) 2);
                    mqMessage.setTryCount(0);
                    mqMessageDao.insert(mqMessage);
                } else {
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                }
            }
        }catch (Exception e){
            logger.error("", e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }
}
