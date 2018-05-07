package com.xq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class ConsumerApplication {
//    git代码测试
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
