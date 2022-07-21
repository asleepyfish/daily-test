package com.asleepyfish.java.stream.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: asleepyfish
 * @Date: 2022-07-20 21:36
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryKey {
    private String securityCode;

    private Integer marketNo;
}
