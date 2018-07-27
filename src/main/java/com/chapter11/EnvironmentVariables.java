package com.chapter11;

import java.util.Map;

/**
 * Created by yangyunming on 2018/7/24
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry me: System.getenv().entrySet()) {
            System.out.println(me.getKey() + " :"  +  me .getValue());
        }
    }
}
