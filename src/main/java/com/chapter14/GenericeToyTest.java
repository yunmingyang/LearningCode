package com.chapter14;

public class GenericeToyTest {
    public static void main(String[] args) throws Exception{
//        使用泛型的确切class对象再newInstance时候可以返回确切的类型
        Class<ToyTest> tyClass = ToyTest.class;
        ToyTest toyTest = tyClass.newInstance();
        Class<? super ToyTest> up =tyClass.getSuperclass();
//        确切类型
//        Class<Toy> up2 = tyClass.getSuperclass();
        Object obj = up.newInstance();
    }
}
