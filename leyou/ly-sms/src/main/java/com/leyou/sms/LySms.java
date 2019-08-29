package com.leyou.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 短信服务启动器
 */
@SpringBootApplication
public class LySms {
    public static void main(String[] args) {
        SpringApplication.run(LySms.class,args);
    }
}