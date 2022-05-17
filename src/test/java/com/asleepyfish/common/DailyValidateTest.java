package com.asleepyfish.common;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
        int[] nums = {2, 3, 4, 5};
        System.out.println(Arrays.toString(constructArr(nums)));
    }

    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        int[] res = new int[a.length];
        for (int i = 0; i < res.length; i++) {
            int tmp = 1;
            for (int j = 0; j < res.length; j++) {
                if (j == i) {
                    continue;
                }
                tmp *= a[j];
            }
            res[i] = tmp;
        }
        return res;
    }

    public int[] constructArr2(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        int[] res = new int[a.length];
        res[0] = 1;
        for (int i = 1; i <= a.length - 1; i++) {
            res[i] = res[i - 1] * a[i - 1];
        }
        int tmp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            res[i] *= tmp;
        }
        return res;
    }
}
