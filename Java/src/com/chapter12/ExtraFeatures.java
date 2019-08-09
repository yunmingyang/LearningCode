package com.chapter12;



class MyException3 extends Exception{
    private int x ;
    public MyException3(){}
    public MyException3(String msg){super(msg);}
    public MyException3(String msg,int x){super(msg);this.x = x;}

    public int getVal(){ return this.x;}
    public String getMessage(){
        return "Detail Message: " + x + " " + super.getMessage(); // 重写了throwable的getMessage方法，，类似toString
    }
}//可继续重写获得更多Exception功能，但是一般查日志不会过于深入，所以自定义Exception最好类名可体现出错误信息



public class ExtraFeatures {
    public static void f() throws MyException3{//throws 异常说明
        System.out.println("Trowing MyException3 from f()");
        throw new MyException3();
    }

    public static void g() throws MyException3{
        System.out.println("Trowing MyException3 from g()");
        throw new MyException3("Origined in g()");
    }

    public static void h() throws MyException3{
        System.out.println("Trowing MyException3 from h()");
        throw new MyException3("Origined in g()",47);
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (MyException3 e){
            e.printStackTrace(System.err);
        }

        try{
            g();
        }catch (MyException3 e){
            e.printStackTrace(System.err);
        }

        try{
            h();
        }catch (MyException3 e){
            e.printStackTrace(System.err);
        }

    }
}
