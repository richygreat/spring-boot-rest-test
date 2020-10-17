package com.github.richygreat.tutorial.sbrt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootRestTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestTestApplication.class, args);
    }
}
