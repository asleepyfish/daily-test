package com.asleepyfish.spring.pojo.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 14:40
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
}
