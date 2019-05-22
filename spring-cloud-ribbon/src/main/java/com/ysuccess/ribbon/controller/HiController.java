package com.ysuccess.ribbon.controller;

import com.ysuccess.ribbon.service.HiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Create by idea
 *
 * @Author: ysuccessup
 * @Date: 2019/5/16 23:09
 */
@RestController
@RequestMapping("/ysuccessup")
public class HiController {

    @Resource
    private HiService hiService;

    @GetMapping(value = "/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return hiService.hiService( name );
    }
}
