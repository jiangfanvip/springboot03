package com.jiangfan.springboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(value = {"classpath:beans.xml"})
@SpringBootApplication
public class Springboot03Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03Application.class, args);
    }

}
