package com.chapter12;

class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human {
    public static void main(String[] args) {
        try{
            throw new Sneeze();
        }
//        catch (Annoyance e){
//            System.out.println("Caught Annoyance");
//        }//编译器发现由于基类异常会将所有派生异常都屏蔽掉，所以报错
        catch (Sneeze e){
            System.out.println("Caught Sneeze");
        }catch (Annoyance e){
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        }catch (Annoyance e){
            System.out.println("Caught Annyance");
        }
    }
}
