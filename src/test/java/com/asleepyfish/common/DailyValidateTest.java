package com.asleepyfish.common;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
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
        map.entrySet().removeIf(entry -> entry.getKey() == 1);
        System.out.println(map);
    }

    @Test
    public void test() {
        System.out.println(lastRemaining(10, 17));
    }

    public int lastRemaining(int n, int m) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            if (n - 1 - index > 0) {
                System.arraycopy(arr, index + 1, arr, index, n - 1 - index);
            }
            arr = Arrays.copyOf(arr, --n);
            System.out.println(Arrays.toString(arr));
        }
        return arr[0];
    }

}
