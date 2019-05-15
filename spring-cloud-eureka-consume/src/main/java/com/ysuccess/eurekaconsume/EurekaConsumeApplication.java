package com.ysuccess.eurekaconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Create by idea
 *
 * @author: ysuccessup
 * @Date: 2019/5/15 23:40
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeApplication.class, args);
    }

}
