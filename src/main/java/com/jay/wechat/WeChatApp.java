package com.jay.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.jay.wechat.dao")
public class WeChatApp{

    public static void main(String[] args) {
        SpringApplication.run(WeChatApp.class, args);
    }
}
