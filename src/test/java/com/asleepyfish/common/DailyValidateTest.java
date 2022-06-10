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
        map.entrySet().removeIf(entry -> entry.getKey() == 2);
        System.out.println(map);
        map.putIfAbsent(1, "f");
        map.putIfAbsent(5, "e");
        System.out.println(map);
    }

    @Test
    public void test() {
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int res = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int tmp = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (tmp < min) {
                    min = tmp;
                    res = i;
                }
            }
        }
        return res;
    }

}
