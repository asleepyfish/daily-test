package com.asleepyfish.service;

import com.asleepyfish.dao.AnimalDao;
import com.asleepyfish.pojo.mybatis.Animal;
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
}
