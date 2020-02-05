package com.boot.dong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@MapperScan("com.boot.dong.mapper")
@EnableJms //启动消息队列
public class DongPlayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongPlayApplication.class, args);
    }

}
