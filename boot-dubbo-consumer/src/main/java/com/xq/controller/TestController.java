package com.xq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xq.domain.User;
import com.xq.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Reference()
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        return testService.say("Hello springboot and dubbo!");
    }
    @GetMapping("user")
    public User user() {
        return testService.findUser();
    }
}
