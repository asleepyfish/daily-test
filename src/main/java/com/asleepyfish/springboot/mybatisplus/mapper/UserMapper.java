package com.asleepyfish.springboot.mybatisplus.mapper;

import com.asleepyfish.springboot.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/18 9:31
 * @Description: TODO
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
