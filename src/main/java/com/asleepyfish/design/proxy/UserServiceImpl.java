package com.asleepyfish.design.proxy;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 15:02
 * @Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("新增一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询一个用户");
    }
}
