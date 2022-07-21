package com.asleepyfish.java.stream.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: asleepyfish
 * @Date: 2022-07-20 21:35
 * @Description: 债券
 */
@Data
public class Bond {
    private Integer bondId;

    private String securityCode;

    private Integer marketNo;

    private String bondName;

    private BigDecimal price;
}
