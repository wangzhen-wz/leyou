package com.leyou.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *  配置中心
 */
@EnableConfigServer
@SpringBootApplication
public class LyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyConfigApplication.class,args);
    }
}
