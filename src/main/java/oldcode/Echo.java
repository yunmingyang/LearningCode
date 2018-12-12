import java.io.*;

public class Echo {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out,true);
        String s = null;
        while((s = in.readLine()) != null && s.length() != 0){
            //System.out.println(s);
            out.println(s);
        }
        out.close();
    }
}
