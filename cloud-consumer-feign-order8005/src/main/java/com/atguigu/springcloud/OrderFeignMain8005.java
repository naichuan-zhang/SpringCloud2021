package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Naichuan Zhang
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain8005 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain8005.class, args);
    }
}
