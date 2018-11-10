package com.chapter11;

import java.util.*;

/**
 * Created by yangyunming on 2018/7/20
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer[] moreInts={11,22,33,44};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,12,13,14,15);
        Collections.addAll(collection,moreInts);
        List<Integer> list = Arrays.asList(34,234,55,6);
//        list.add(333);
        list.set(3,333);//本身是数组，所以无法做add操作
    }
}
