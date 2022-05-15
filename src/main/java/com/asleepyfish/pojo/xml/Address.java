package com.asleepyfish.pojo.xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 13:08
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Address {
    @Value("合肥市")
    private String name;
}
