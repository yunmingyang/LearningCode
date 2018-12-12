package com.chapter11;

import java.util.*;

public class ModifyingArrayAsList {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] i = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<Integer>(
                Arrays.asList(i)
        );
        System.out.println("Before: " + list);
        Collections.shuffle(list,random);
        System.out.println("After: " + list);
        System.out.println("Base: " + Arrays.toString(i));//直接+i会有提示，应为array中没有响应的toString实现，所以使用
        //工具类Arrays去做toString

        List<Integer> list1 = Arrays.asList(i);//直接使用了原数组创建出来的List，所以shuffle之后变为乱序，上一个未变乱序是由于创建了另一个对象
        System.out.println("Before: " + list1);
        Collections.shuffle(list1,random);
        System.out.println("After: " + list1);
        System.out.println("Base: " + Arrays.toString(i));
    }

}
