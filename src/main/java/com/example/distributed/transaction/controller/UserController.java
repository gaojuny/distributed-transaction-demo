package com.example.distributed.transaction.controller;

import com.example.distributed.transaction.model.UserExample;
import com.example.distributed.transaction.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: gaojun
 * @date: 2019/4/30 17:37
 * @description:
 */
@RestController("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public boolean saveUser(UserExample user){
        return true;
    }
}
