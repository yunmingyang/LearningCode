package com.chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader bufferedReader;
    public InputFile(String file)throws Exception{
        try {
            //此处FileReader用处其实不大，但是可以用来创建BufferedReader需要使用的对象
            bufferedReader = new BufferedReader(new FileReader(file));
        }catch (FileNotFoundException e){
            //FileReader构造失败会抛出该异常，此时不需要关闭文件，因为该文件还没被打开
            System.out.println("Couldn't find the file " + file);
        }catch (Exception e){
            try{
                bufferedReader.close();
            }catch (IOException ioe){
                System.out.println("bufferedreader close failed");
            }
            //关闭文件后，为了表示构造出现了问题，异常需要重新被抛出
            throw e;
        }finally {
            //不可此处关闭输入流
            //此处无论何时都会执行，在此处执行关闭文件操作，就会导致构造函数构造的bufferedReader在构造函数执行完成后，就被关闭了
        }
    }

    public String getLine(){
        String s;
        try {
            s = bufferedReader.readLine();
        }catch (IOException e){
            //RuntimeException属于严重编程错误，不应该捕获，，也不需要在异常列表中声名，且会直接抛到main函数中
            throw new RuntimeException("readLine failed");
        }
        return s;
    }

    public void dispose(){
        try{
            bufferedReader.close();
            System.out.println("bufferedreader close() successful");
        }catch (IOException e){
            throw new RuntimeException("in.close() failed");
        }
    }

    public static void main(String[] args) {
        //构造中可能会出现异常的类并且要求清理，最好使用嵌套的try catch
        try {
            InputFile in = new InputFile("./src/main/java/com/chapter12/InputFile.java");
            try{
                String s ;
                int i = 1;
                while((s = in.getLine()) != null)
                    System.out.println(s);
            }catch (Exception e){
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            }finally {
                in.dispose();
            }
        }catch (Exception e){
            System.out.println("InputFile construction failed");
        }
    }

}
