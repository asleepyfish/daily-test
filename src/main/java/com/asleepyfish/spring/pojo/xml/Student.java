package com.asleepyfish.spring.pojo.xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/12 15:35
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private Double score;
    private Address address;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
