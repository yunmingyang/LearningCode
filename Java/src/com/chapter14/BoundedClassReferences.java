package com.chapter14;

public class BoundedClassReferences {
    public static void main(String[] args) {
        //泛型范围，提供编译期预检查
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}
