package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Naichuan Zhang
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7000.class, args);
    }
}
