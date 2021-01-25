package com.nxyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 11:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain9101 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain9101.class, args);
    }
}
