package com.chapter12;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException2 {
    private static Logger logger = Logger.getLogger("LoggingException2");

    public static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));//标准错误流写入StringWriter
        logger.severe(trace.toString());//logger打印相应异常
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        }catch (NullPointerException npe){
            logException(npe);
        }
    }

}
