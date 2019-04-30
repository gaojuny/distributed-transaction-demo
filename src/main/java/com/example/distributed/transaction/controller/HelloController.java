package com.example.distributed.transaction.controller;

import com.example.distributed.transaction.dao.TMqMessageDao;
import com.example.distributed.transaction.model.TMqMessage;
import com.example.distributed.transaction.model.TMqMessageExample;
import com.example.rabbitmq.config.Producer;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: gaojun
 * @date: 2019/4/30 16:27
 * @description:
 */
@RestController
@RequestMapping("")
public class HelloController {
    @Resource
    private Producer producer;
    @Resource
    private TMqMessageDao mqMessageDao;
    @Resource
    private Gson gson;

    @RequestMapping("send")
    public String sendMsg(String msg){
        List<TMqMessage> mqMessages = mqMessageDao.selectByExample(new TMqMessageExample());
        String json = gson.toJson(mqMessages);
        producer.sendMsg(json);
        return json;
    }

    @RequestMapping("user/")
    public boolean saveUser(String msg){
        List<TMqMessage> mqMessages = mqMessageDao.selectByExample(new TMqMessageExample());
        String json = gson.toJson(mqMessages);
        producer.sendMsg(json);
        return true;
    }
}
