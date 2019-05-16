package com.ysuccess.eurekaribbon.controller;

import com.ysuccess.eurekaribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by idea
 *
 * @Author: ysuccessup
 * @Date: 2019/5/16 23:09
 */
@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return hiService.hiService( name );
    }
}
