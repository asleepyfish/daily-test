package com.asleepyfish.common;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/12 15:50
 * @Description: 验证测试
 */
public class DailyValidateTest {
    @Test
    public void collectionTest() {
        Map<Integer, String> map = new HashMap<>(16);
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.entrySet().removeIf(entry -> entry.getKey() == 1);
        System.out.println(map);
    }

    @Test
    public void test() {

    }
}
