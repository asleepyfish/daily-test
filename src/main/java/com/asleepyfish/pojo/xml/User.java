package com.asleepyfish.pojo.xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 13:55
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Dog dog;
    private Cat cat;
    private String name;
}
