package com.chapter14;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;

        intClass = double.class;
//        通过使用泛型进行检查
//        genericIntClass = double.class;
    }
}
