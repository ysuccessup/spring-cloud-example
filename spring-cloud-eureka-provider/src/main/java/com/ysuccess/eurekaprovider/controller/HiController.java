package com.ysuccess.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/hi")
    public String index(String name){
        return "hello,"+name+",this is the first msg";
    }
}
