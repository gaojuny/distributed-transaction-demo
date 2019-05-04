package com.example.distributed.customer.service;


import com.example.distributed.customer.dao.TUserDao;
import com.example.distributed.customer.model.TUser;
import com.example.rabbitmq.config.RabbitmqConfig;
import com.example.rabbitmq.config.User;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author gaojun
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
@RabbitListener(queues = RabbitmqConfig.QUEUE_A)
public class TUserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private Gson gson;
    @Resource
    private TUserDao tUserDao;


    @RabbitHandler
    public boolean insertUserMessage(String userString) {
        try {
            if (!StringUtils.isEmpty(userString)) {
                return false;
            }
            User user = gson.fromJson(userString, User.class);
            TUser tUser = new TUser();
            tUser.setName(user.getName());
            int insert = tUserDao.insert(tUser);
            if (insert <= 0) {
                return false;
            }
        } catch (JsonSyntaxException e) {
            logger.error("user格式错误", e);
            return false;
        }
        return true;
    }


}
