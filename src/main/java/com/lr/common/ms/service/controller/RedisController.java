package com.lr.common.ms.service.controller;

import com.lr.common.ms.service.redis.RedisService;
import com.lr.common.ms.service.redis.UserKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/redis/insertString", method = RequestMethod.GET)
    public void insertString() {
        redisService.set(UserKey.getById,"key1","sssssssssssssssssss");
    }

    @RequestMapping(value = "/redis/getString", method = RequestMethod.GET)
    public void getString() {
        String value = redisService.get(UserKey.getById,"key1",String.class);
        System.out.println(value);
    }


}
