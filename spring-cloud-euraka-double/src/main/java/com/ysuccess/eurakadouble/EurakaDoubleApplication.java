package com.ysuccess.eurakadouble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaDoubleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakaDoubleApplication.class, args);
    }

}
