package com.ysuccess.feignhystrix.service;

import org.springframework.stereotype.Component;

/**
 * Create by idea
 *
 * @Author: ysuccessup
 * @Date: 2019/5/16 23:46
 */
@Component //注入到Ioc容器中
public class HiServiceHystric implements HiService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}