package com.ysuccess.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by idea
 *
 * @Author: ysuccessup
 * @Date: 2019/5/20 23:02
 */
@RestController
@RequestMapping("/ysuccessup")
public class ConfigClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }


}
