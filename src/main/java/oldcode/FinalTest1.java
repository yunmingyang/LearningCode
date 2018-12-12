package com.finaltest;

public class FinalTest1 extends FinalTest {
    public void test1(){
        System.out.println("test1");
    }


    public static void main(String[] args){
        FinalTest1 fT=new FinalTest1();
        fT.test2();
        FinalTest fT1=new FinalTest1();
        fT1.test1();
        FinalTest fT2=new FinalTest();
        fT2.test1();
        fT2.test2();
    }
}
