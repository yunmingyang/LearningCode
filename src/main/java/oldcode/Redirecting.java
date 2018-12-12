import java.io.*;

public class Redirecting {
    public static void main(String[] args) throws IOException{
        //BufferInputStream
        BufferedInputStream in= new BufferedInputStream(new FileInputStream(
                "D://code//java//IOProject//src//Redirecting.java"
        ));
        //PrintStream
        PrintStream out = new PrintStream(new FileOutputStream(
                "D://down//test.out"
        ));
        //setIn
        System.setIn(in);
        //setOut
        System.setOut(out);
        //setErr
        System.setErr(out);
        //BufferReader
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //String s
        String s = null;
        //循环遍历
        while((s = br.readLine()) != null)
            System.out.println(s);
        out.close();
        System.setOut(System.out);
    }
}
