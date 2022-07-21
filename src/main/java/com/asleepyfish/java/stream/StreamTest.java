package com.asleepyfish.java.stream;

import com.asleepyfish.java.stream.pojo.Bond;
import com.asleepyfish.java.stream.pojo.PrimaryKey;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/14 14:52
 * @Description: TODO
 */
public class StreamTest {
    public static void main(String[] args) throws IOException {
        List<Bond> bonds = new ArrayList<>();
        Map<PrimaryKey, List<String>> groupMap = bonds.stream().collect(Collectors.groupingBy(bond -> new PrimaryKey(bond.getSecurityCode(), bond.getMarketNo())))
                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().map(Bond::getBondName).distinct().collect(Collectors.toList())));
    }
}
