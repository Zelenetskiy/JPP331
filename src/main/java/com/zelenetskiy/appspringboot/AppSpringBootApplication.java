package com.zelenetskiy.appspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

public class AppSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppSpringBootApplication.class, args);
    }

}
