package com.boot.dong.util;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConnectionUtil {
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("localhost");
        //端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
        factory.setVirtualHost("testhost");
        factory.setUsername("seven");
        factory.setPassword("7777777");
        // 通过工程获取连接
        Connection connection = factory.newConnection();
        return connection;
    }

}
