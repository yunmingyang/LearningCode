package com.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by yangyunming on 2018/7/23
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(50);
            Integer count = map.get(r);//当有存储数字的需求且数字可能为0时，可以使用Integer
            map.put(r,count == null ? 1 : count++);
        }
        System.out.println(map);
    }
}
