package com.asleepyfish.springboot.mybatisplus.pojo;

import lombok.Data;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/18 9:30
 * @Description: TODO
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
