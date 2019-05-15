package com.ysuccess.eurekaconsume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ysuccess.eurekaconsume.service.ServiceHi;

/**
 * Create by idea
 *
 * @Author: ysuccessup
 * @Date: 2019/5/15 23:44
 */
@RestController
@RequestMapping("/ysuccessup")
public class HiController {

    @Autowired
    private ServiceHi serviceHi;

    @RequestMapping("/hi/{name}")
    public String index(@PathVariable("name") String name) {
        return serviceHi.sayHiFromClientOne(name);
    }

}
