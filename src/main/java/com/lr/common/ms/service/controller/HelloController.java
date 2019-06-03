package com.lr.common.ms.service.controller;

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

    @RequestMapping("/hello/themaleaf")
    public String hello(Model model){
        model.addAttribute("name", "Joshua");
        return "hello";
    }
}
