import sun.awt.image.BufferedImageDevice;

import java.io.*;

public class BasicFileOutput {
    //静态String变量file
    static String file = "D://code//1.txt";
    //主函数
    public static void main(String[] args) throws IOException{
        //BufferReader，承接StringReader，其又承接BufferedInputFile
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read(
                                "D://code//java//IOProject//src//BasicFileOutput.java"
                        )));
        //PrintWriter，承接FileWriter中间加一层BufferedWriter
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file)
                ));
        int count = 0;
        String s = null;
        while((s = in.readLine()) != null)
            out.println(count++ + " :" + s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
