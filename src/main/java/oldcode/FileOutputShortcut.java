import java.io.*;

public class FileOutputShortcut {
    //静态字符串文本路径
    static String file = "//home//yang//1.txt";
    //主函数
    public static void main(String[] args) throws IOException{
        //BufferReader in
        BufferedReader in = new BufferedReader(new FileReader(
                "//home//yang//1.txt"));
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
    }
}
