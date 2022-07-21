package com.asleepyfish.springboot.leaf.service;

import java.util.UUID;

/**
 * @Author: asleepyfish
 * @Date: 2022-07-21 19:29
 * @Description: TODO
 */
public class LeafService {
    public String getLeafId() {
        return UUID.randomUUID().toString();
    }
}
