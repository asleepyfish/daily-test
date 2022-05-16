package com.asleepyfish.spring.annotation;

import com.asleepyfish.pojo.xml.Address;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/16 18:37
 * @Description: TODO
 */
@SpringBootTest
public class AnnotationIocTest {
    @Resource
    private Address address;

    @Test
    public void getAddress() {
        System.out.println(address.getName());
    }
}
