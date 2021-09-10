package com.wanxiang.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wanxiang.web.mapper")
@SpringBootApplication
public class WebApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);

    }

}
