package com.nxyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 12:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain9200Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain9200Application.class, args);
    }
}
