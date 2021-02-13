package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Naichuan Zhang
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain8003 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain8003.class, args);
    }
}
