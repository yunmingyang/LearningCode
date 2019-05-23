package com.chapter12;

/**
 * Created by yangyunming on 2018/7/24
 */
class MyException extends Exception{
    public MyException(){}
    public MyException(String str){super(str);}
}
public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);//此处若传参数为out的话，则信息发送到out上，若不传参则呗传到err上
        }
        try{
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }

}
