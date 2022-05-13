package com.asleepyfish.design.proxy;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 14:55
 * @Description: TODO
 */
@SpringBootTest
public class ProxyTest {
    @Resource
    private UserService userService;

    @Test
    public void proxy() {
        Rent host = new Host();
        // 代理角色需要传入真实角色表示要帮谁做事
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }

    @Test
    public void UserServiceProxy() {
        UserService userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.query();
    }

    @Test
    public void InvocationHandlerTest() {
        Rent rent = new Host();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(rent);
        Object proxy = proxyInvocationHandler.getProxy();
        if (proxy instanceof Rent) {
            ((Rent) proxy).rent();
        }
    }

    @Test
    public void aopTest() {
        userService.add();
    }
}
