package com.asleepyfish.controller;

import com.asleepyfish.service.AnimalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/16 13:42
 * @Description: TODO
 */
@RestController
public class AnimalController {
    @Resource
    private AnimalService animalService;

    @PostMapping("/getAnimals")
    public void getAnimals(Integer id) {
        System.out.println(animalService.getAnimals(id));
    }
}
