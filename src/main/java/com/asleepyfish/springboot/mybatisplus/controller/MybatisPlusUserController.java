package com.asleepyfish.springboot.mybatisplus.controller;

import com.asleepyfish.springboot.mybatisplus.mapper.UserMapper;
import com.asleepyfish.springboot.mybatisplus.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/18 10:22
 * @Description: TODO
 */
@RestController
@RequestMapping("/mybatisPlus")
public class MybatisPlusUserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/insertUser")
    public Integer insertUser(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @RequestMapping("/updateUser")
    public Integer updateUser(@RequestBody User user) {
        return userMapper.updateById(user);
    }
}
