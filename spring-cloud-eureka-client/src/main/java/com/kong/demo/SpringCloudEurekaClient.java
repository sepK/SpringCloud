package com.kong.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author t.k
 * @date 2021/10/26 14:33
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClient {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClient.class, args);
    }
}
