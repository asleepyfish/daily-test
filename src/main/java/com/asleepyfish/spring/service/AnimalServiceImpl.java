package com.asleepyfish.spring.service;

import com.asleepyfish.spring.dao.AnimalDao;
import com.asleepyfish.spring.pojo.mybatis.Animal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/16 13:39
 * @Description: TODO
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    @Resource
    private AnimalDao animalDao;

    @Override
    public Animal getAnimals(Integer id) {
        return animalDao.getAnimals(id);
    }

    @Override
    public Integer insertAnimal(Animal animal) {
        return animalDao.insertAnimal(animal);
    }

    @Override
    public Integer deleteAnimal(Integer id) {
        return animalDao.deleteAnimal(id);
    }
}
