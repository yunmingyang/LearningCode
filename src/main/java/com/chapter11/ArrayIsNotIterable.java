package com.chapter11;

import java.util.Arrays;

public class ArrayIsNotIterable {
    public static <T> void test(Iterable<T> it){
        for (T t : it)
            System.out.println(t);
    }


    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));

        String[] str = {"A","B","C"};
//        test(str);
//        不存在自动包装，需要手动转换成一个Collection
        test(Arrays.asList(str));
    }
}
