package com.nxyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 13:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerMain9201Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain9201Application.class, args);
    }
}
