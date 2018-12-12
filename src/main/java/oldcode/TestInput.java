import java.io.FileWriter;
import java.io.IOException;

public class TestInput {
    public static void main(String[] args) throws IOException{
        FileWriter f = new FileWriter("E:\\1.txt");


        f.write("aaaa");
        f.flush();


        f.write("bbbb");
        f.close();
    }
}
