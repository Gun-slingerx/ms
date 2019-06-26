package com.lr.common.ms.service.controller;

import com.lr.common.ms.service.entity.User;
import com.lr.common.ms.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Author (ノ ￣ ▽ ￣) LR
 * @Date 2019/6/3 16:36
 * @Description
 **/
@Controller
@RequestMapping("/demo")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello/themaleaf")
    public String hello(Model model){
        model.addAttribute("name", "Joshua");
        return "hello";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = userService.getUser(1);
        System.out.println(user.getName());
        return user;
    }

}
