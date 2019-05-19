package com.ysuccess.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by idea
 *
 * @author: ysuccessup
 * @Date: 2019/5/15 23:40
 */
@RestController
@RequestMapping("ysuccessup")
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "yy") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
