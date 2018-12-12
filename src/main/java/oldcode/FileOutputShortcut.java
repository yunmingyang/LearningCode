import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {
    //静态字符串文本路径
    static String file = "D://code//1.txt";
    //主函数
    public static void main(String[] args) throws IOException{
        //BufferReader in
        BufferedReader in = new BufferedReader(
                new StringReader(BufferedInputFile.read(
                        "D://down//1.txt")));
        //PrintWriter out
        PrintWriter fileWriter = new PrintWriter(file);
        //count
        int count = 0;
        //String s
        String s = null;
        //循环遍历
        while((s = in.readLine()) != null)
            System.out.println(count++ + ":" + s + "\n");
        fileWriter.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
