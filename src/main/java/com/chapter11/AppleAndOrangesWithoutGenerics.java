package com.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyunming on 2018/7/20
 */
public class AppleAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList();
        for (int i = 0; i < 3 ; i++) {
            list.add(new Apple());
        }
//        list.add(new com.chapter11.Orange());//编译时检查,即若不适用泛型，编译不会报错；但若泛型中制定类型，则会报错
        for (int i = 0; i < list.size(); i++) {
            ((Apple)list.get(i)).getId();//直接get的时候没有getId的方法，由于统一继承了Object
        }
    }
}
class Apple{
    private static long counter;
    private final long id = counter++;

    public long getId() {
        System.out.println(id);
        return id;
    }
}
class Orange{

}