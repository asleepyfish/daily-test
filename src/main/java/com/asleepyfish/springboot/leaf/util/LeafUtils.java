package com.asleepyfish.springboot.leaf.util;

import com.asleepyfish.springboot.leaf.service.LeafService;

/**
 * @Author: asleepyfish
 * @Date: 2022-07-21 21:02
 * @Description: TODO
 */
public class LeafUtils {

    private static LeafService leafService;

    public LeafUtils(LeafService leafService) {
        LeafUtils.leafService = leafService;
    }

    public static String getId() {
        return leafService.getLeafId();
    }
}
