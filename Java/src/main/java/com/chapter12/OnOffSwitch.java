package com.chapter12;

public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffExceptino1,OnOffException2{}

    public static void main(String[] args) {
        try{
            sw.on();
            f();
//            sw.off();
        }catch (OnOffExceptino1 e){
            System.out.println("OnOffException1");
//            sw.off();
        }catch (OnOffException2 e){
            System.out.println("OnOffException2");
//            sw.off();
        }finally {
            sw.off();
        }
    }
}
class Switch{
    private boolean state = false;
    public boolean read(){return state;}
    public void on(){
        state = true;
        System.out.println(this);
    }
    public void off(){
        state = false;
        System.out.println(this);
    }
    public String toString(){
        return state ? "on" : "off";
    }
}

class OnOffExceptino1 extends Exception{}
class OnOffException2 extends Exception{}