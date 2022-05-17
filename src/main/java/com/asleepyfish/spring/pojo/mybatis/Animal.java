package com.asleepyfish.spring.pojo.mybatis;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/16 13:33
 * @Description: TODO
 */
@Data
@Component
public class Animal {
    private Integer id;
    private String name;
    private String description;
}
