package com.ysuccess.eurekaconsume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by idea
 *
 * @author: ysuccessup
 * @Date: 2019/5/15 23:40
 */

/**
 * 加入熔断前：@FeignClient(value = "service-hi")
 * 加入熔断后：@FeignClient(value = "service-hi",fallback = ServiceHiHystric.class)
 */
@FeignClient(value = "service-hi",fallback = ServiceHiHystric.class)
public interface ServiceHi {

    @RequestMapping(value = "/ysuccessup/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}