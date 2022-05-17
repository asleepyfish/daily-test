package com.asleepyfish.spring.pojo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 17:43
 * @Description: TODO
 */
@Configuration
public class ProductConfig {
    @Bean
    public Product product() {
        return new Product("电脑");
    }
}
