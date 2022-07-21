package com.asleepyfish.springboot.leaf.util;

import com.asleepyfish.springboot.leaf.service.LeafService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: asleepyfish
 * @Date: 2022-07-21 21:02
 * @Description: TODO
 */
@Component
public class LeafUtils {

    private static LeafService leafService;

    /**
     * setter注入
     *
     * @param leafService
     */
    @Autowired
    public void setLeafService(LeafService leafService) {
        LeafUtils.leafService = leafService;
    }

    public static String getId() {
        return leafService.getLeafId();
    }
}
