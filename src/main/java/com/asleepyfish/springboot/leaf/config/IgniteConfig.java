package com.asleepyfish.springboot.leaf.config;

import com.sankuai.inf.leaf.plugin.utils.SnowflakeIdUtils;
import com.sankuai.inf.leaf.service.SnowflakeService;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Author: zhoujh42045
 * @Date: 2022/7/21 15:52
 * @Description: TODO
 */
@Configuration
public class IgniteConfig {

    @Bean
    public Ignite ignite() {
        return Ignition.start();
    }
}
