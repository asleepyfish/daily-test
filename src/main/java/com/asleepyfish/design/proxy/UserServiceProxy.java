package com.asleepyfish.design.proxy;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 15:03
 * @Description: TODO
 */

public class UserServiceProxy implements UserService {
    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    private void log(String msg) {
        System.out.printf("执行%s操作\n", msg);
    }
}
