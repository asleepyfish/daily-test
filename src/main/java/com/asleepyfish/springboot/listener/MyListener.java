package com.asleepyfish.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 17:25
 * @Description: TODO
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("当前web应用启动。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("当前web应用销毁。。。");
    }
}
