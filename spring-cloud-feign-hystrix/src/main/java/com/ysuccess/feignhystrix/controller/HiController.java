package com.ysuccess.feignhystrix.controller;

import com.ysuccess.feignhystrix.service.HiService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create by idea
 *
 * @Author: ysuccessup
 * @Date: 2019/5/15 23:44
 */
@RestController
@RequestMapping("/ysuccessup")
public class HiController {

    @Resource
    private HiService hiService;

    @RequestMapping("/hi/{name}")
    public String index(@PathVariable("name") String name) {
        return hiService.sayHiFromClientOne(name);
    }

}
