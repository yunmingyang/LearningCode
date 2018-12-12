package com.chapter12;

public class LostMessage {
    void f() throws VeryImportantException{throw new VeryImportantException();}
    void dispose() throws HoHumException{throw new HoHumException();}

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }finally {
//                lm.dispose();
                return;//异常丢失
            }
        }catch (Exception e){
            System.out.println(e);//finally子句重新抛出异常，覆盖了正常的异常抛出
        }
    }
}



class VeryImportantException extends Exception{
    public String toString(){
        return "A very important exception!";
    }
}
class HoHumException extends Exception{
    public String toString(){
        return "A trivial exception";
    }
}
