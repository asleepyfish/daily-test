package com.asleepyfish.springboot.leaf.controller;

import com.asleepyfish.springboot.leaf.util.LeafUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: asleepyfish
 * @Date: 2022-07-21 19:31
 * @Description: TODO
 */
@RestController
public class LeafController {

    @PostMapping("/getId")
    public String getId() {
        return LeafUtils.getId();
    }
}
