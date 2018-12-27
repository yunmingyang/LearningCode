package com.chapter13;

public class DatabaseException extends Exception {
    public DatabaseException(int transactionId ,int queryqID,String message){
        //返回一个String对象，内部同样使用一个Formatter对象。使用此方法更快捷一点
        super(String.format("(t%d,q%d) %s",transactionId,queryqID,message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3,7,"Write failed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
