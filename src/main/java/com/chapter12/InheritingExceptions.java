package com.chapter12;

/**
 * Created by yangyunming on 2018/7/24
 */
class SimpleException extends Exception{}

public class InheritingExceptions {
    public void f()throws SimpleException {
        System.out.println("Throw SimpleException form f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try{
            sed.f();
        }catch (SimpleException e){
            System.out.println("catch SimpleException");
        }
    }
}
