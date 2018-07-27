package com.chapter11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by yangyunming on 2018/7/24
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        Collections.addAll(collection,"Take the long way home".split(" "));
        for (String s :collection) {
            System.out.print("'" + s + "'");
        }
    }
}
