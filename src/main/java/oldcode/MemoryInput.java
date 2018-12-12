import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    //主函数
    public static void  main(String[] args) throws IOException{
        //从BufferInputFile.read()读入的String结果被用来创建一个StringReader，然后
        //调用read（）每次返回一个字符，并把它发送到控制台
        StringReader in = new StringReader(BufferedInputFile.read(
                "D://code//java//IOProject//src//MemoryInput.java"));
        int c;
        while((c = in.read()) != -1)
            System.out.println((char)c);
        in.close();
    }
}
