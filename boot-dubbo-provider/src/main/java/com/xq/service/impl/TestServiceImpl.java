package com.xq.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xq.domain.User;
import com.xq.service.TestService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String say(String text) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + text;

    }
    @Override
    public User findUser() {

        User user = new User();
        user.setId(1001);
        user.setUserName("scott");
        user.setPasswd("pwd");
        user.setDesc("测试信息");
        return user;
    }
}
