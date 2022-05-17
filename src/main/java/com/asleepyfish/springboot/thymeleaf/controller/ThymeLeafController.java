package com.asleepyfish.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 13:55
 * @Description: TODO
 */
@Controller
public class ThymeLeafController {

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("name", "<h1>Asleepyfish</h1>");
        map.put("employees", Arrays.asList("程序员", "架构师", "项目经理"));
        return "success";
    }
}
