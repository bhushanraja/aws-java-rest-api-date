package com.date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.date.controller")
public class ServerDateApplication extends SpringBootServletInitializer  {
    public static void main(String[] args) {
        SpringApplication.run(ServerDateApplication.class, args);
    }
}
