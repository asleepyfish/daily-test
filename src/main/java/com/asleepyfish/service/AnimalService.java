package com.asleepyfish.service;

import com.asleepyfish.pojo.mybatis.Animal;

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
}
