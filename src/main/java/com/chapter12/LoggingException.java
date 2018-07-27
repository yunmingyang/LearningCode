package com.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by yangyunming on 2018/7/24
 */
class LogginExceptino extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");
    public LogginExceptino(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class LoggingException  {
    public static void main(String[] args) {
        try {
            throw new LogginExceptino();
        }catch (LogginExceptino e){
            System.err.println("Caught" + e);
        }
        try {
            throw new LogginExceptino();
        }catch (LogginExceptino e){
            System.err.println("Caught" + e);
        }
    }
}
