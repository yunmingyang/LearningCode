package com.chapter11;

import java.util.*;

/**
 * Created by yangyunming on 2018/7/23
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i < 10000;i++)
            set.add(random.nextInt(50));
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

