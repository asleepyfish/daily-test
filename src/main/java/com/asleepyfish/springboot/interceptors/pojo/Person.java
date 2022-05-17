package com.asleepyfish.springboot.interceptors.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 15:32
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Person {
    private Integer id;
    private String username;
    private String password;
}
