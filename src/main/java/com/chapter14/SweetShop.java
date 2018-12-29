package com.chapter14;

class Candy{
    static {
        System.out.println("Loading Candy");
    }
}
class Gum{
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
//    非静态变量不预先加载
//    private int num = print();
//    预先加载静态变量
//    private static int num = print();
//    public static int print(){
//        //
//        System.out.println("SweetShop Loading");
//        return 1;
//    }
    private static Gum g = new Gum();

    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try{
            //需要完整路径，否则会抛出异常
            Class.forName("com.chapter14.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("Counldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
