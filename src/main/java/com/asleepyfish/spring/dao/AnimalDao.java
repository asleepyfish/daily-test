package com.asleepyfish.spring.dao;

import com.asleepyfish.spring.pojo.mybatis.Animal;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/16 13:37
 * @Description: TODO
 */
@Repository
public interface AnimalDao {
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
