import java.io.*;

public class TestSerializable implements Serializable{
    public static void main(String[] args) throws NotSerializableException,FileNotFoundException,IOException{
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("//home//yang//SweetCode//X.file"));
        Test t = new Test(10);
        //out.writeObject("oh~~~~~~~~~~");
        out.writeObject(t);
        out.close();
    }
}


