import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ReadSerializable implements Serializable{
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(
                        new File(
                                "//home//yang//SweetCode//",
                                "X.file"
                        )
                ));
        System.out.println(in.readObject().getClass());
    }
}

