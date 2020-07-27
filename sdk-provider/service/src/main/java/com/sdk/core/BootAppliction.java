package com.sdk.core;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootAppliction {
    public static void main(String[] args) {
        SpringApplication.run(BootAppliction.class, args);
    }
}
