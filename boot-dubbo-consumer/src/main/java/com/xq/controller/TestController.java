package com.xq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfItem;
import com.xq.domain.User;
import com.xq.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @DisconfItem(key =Money_Key)
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private  double money=100;

    private static final String Money_Key="money";


    @Reference()
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        return testService.say("Hello springboot and dubbo!"+money);
    }
    @GetMapping("user")
    public User user() {
        return testService.findUser();
    }
}
