import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    //静态read方法，返回为String，参数为一个字符串类型的filename
    //通过BufferReader，缓存输入流，然后通过一个String对象承接输入流
    //并使用Stringbuilder作为最后的返回字符串对象
    //最后关闭输入流
    public  static String read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s ;
        StringBuilder strBuild = new StringBuilder();//此处需要在堆上为其申请空间，
                                                                          // 初次使用时，直接赋值为空了
        while ((s = in.readLine()) != null){
            strBuild.append(s);
        }
        in.close();
        return strBuild.toString();
    }
    //主函数
    public static void main(String[] args) throws IOException {
        System.out.println(read("BufferedInputFile.java"));//最终没找到文件夹
    }
}
