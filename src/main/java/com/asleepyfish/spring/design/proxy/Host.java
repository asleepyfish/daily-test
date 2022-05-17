package com.asleepyfish.spring.design.proxy;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 14:51
 * @Description: TODO
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东租房~");
    }
}
