package com.nxyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: nxyf
 * @description:
 * @author: myj
 * @create: 2021-01-25 10:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain9100 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain9100.class, args);
    }
}
