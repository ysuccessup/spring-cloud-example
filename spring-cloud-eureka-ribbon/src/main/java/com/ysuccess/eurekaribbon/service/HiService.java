package com.ysuccess.eurekaribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Create by idea
 *
 * @Author: ysuccessup
 * @Date: 2019/5/16 23:10
 */
@Service
public class HiService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * @HystrixCommand
     * 指定断路后执行的方法，通过其调用服务，实现fallback方法
     *
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/ysuccessup/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
