package com.chapter14;

import java.util.Random;

class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;//不会初始化Initable
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);//非编译器常量，所以触发了Initable的初始化操作
        System.out.println(Initable2.staticNonFinal);//对一个static且不是final的域访问时候，总是要求在读取前，首先进行链接和初始化
        Class initable3 = Class.forName("com.chapter14.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
