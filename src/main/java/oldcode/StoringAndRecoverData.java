import java.io.*;

public class StoringAndRecoverData {
    public static void main(String[] args) throws IOException{
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("D://down//test.txt")
                )
        );
        out.writeDouble(3.14);
        out.writeBoolean(false);
        out.writeUTF("That was PI");
        out.writeDouble(1.4143);
        out.writeUTF("Square root of 2");
        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("D://down//test.txt")
                )
        );
        System.out.println(in.readDouble());
        System.out.println(in.readBoolean());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }
}
