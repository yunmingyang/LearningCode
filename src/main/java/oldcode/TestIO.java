import java.io.*;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) throws IOException {
        /*
        * FileInputStream 从文件中读取数据
        * FileOutputStream 向文件中写入数据
        */
        byte[] bWrite = {1,2,33,127};
        FileOutputStream fo = new FileOutputStream("E:/code/README.txt");
        for(int i:bWrite){
            System.out.println(i);
            fo.write(i);
        }
        fo.close();

        /*File f = new File("E:/code/README.txt");
        InputStream out = new FileInputStream(f);
        */
        /* char c ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'Q'键退出。");

        try{
            do{
                c = (char)br.read();
            }while(c != 'q');
        }catch(IOException e){
            e.getMessage();
        }*/
/*        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        if (sc.hasNext()){
            String str = sc.next();
            System.out.println(str);
        }*/
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Please enter line of text");
        System.out.println("End with 'end'");
        do {
                str = br.readLine();
                System.out.println(str);
        } while (!str.equals("end"));*/

    }
}

