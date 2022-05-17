package com.asleepyfish.spring.service;

import com.asleepyfish.spring.pojo.mybatis.Animal;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/16 13:38
 * @Description: TODO
 */
public interface AnimalService {
    /**
     * 获取动物信息
     *
     * @param id
     * @return
     */
    Animal getAnimals(Integer id);

    /**
     * 插入
     * @param animal
     * @return
     */
    Integer insertAnimal(Animal animal);

    /**
     * 删除
     * @param id
     * @return
     */
    Integer deleteAnimal(Integer id);
}
