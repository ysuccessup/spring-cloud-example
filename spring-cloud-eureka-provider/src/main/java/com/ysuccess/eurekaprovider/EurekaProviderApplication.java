package com.ysuccess.eurekaprovider;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Create by idea
 *
 * @author: ysuccessup
 * @Date: 2019/5/15 23:40
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {

    /**
     *  @EnableDiscoveryClient 基于spring-cloud-commons,有许多种实现(eureka、consul、zookeeper等等)
     *  @EnableEurekaClient 基于spring-cloud-netflix,选用的注册中心是eureka，那么就推荐@EnableEurekaClient
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
