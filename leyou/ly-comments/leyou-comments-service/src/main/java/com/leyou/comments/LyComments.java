package com.leyou.comments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 开启feign
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LyComments {
    public static void main(String[] args) {
        SpringApplication.run( LyComments.class,args);
    }
}
