package com.chapter14;

public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;//泛型通配符
        intClass = double.class;
    }
}
