package com.asleepyfish.spring.controller;

import com.asleepyfish.spring.pojo.mybatis.Animal;
import com.asleepyfish.spring.service.AnimalService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/transactional")
    public void transactional(@RequestBody Animal animal, Integer id) {
        animalService.insertAnimal(animal);
        animalService.deleteAnimal(id / 0);
    }
}
