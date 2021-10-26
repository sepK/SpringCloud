package com.kong.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 * @author t.k
 * @date 2021/10/26 14:35
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer.class, args);
    }
}
