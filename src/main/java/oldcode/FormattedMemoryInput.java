import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main (String[] args) throws IOException{
        //DataInputStream面向字节，因此需要接受一个ByteArrayInputStram-------
        // 因为其中getBytes（）方法可以产生String数组，
        //在该Stream中传入BufferInputFile.read().getBytes()
        //通过catch EOFException 结束
        try{
            DataInputStream in= new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read(
                            "D://code//java//IOProject//src//FormattedMemoryInput.java").getBytes()
            ));
            while(/*true*/in.available() != 0)
                System.out.println((char)in.readByte());
        }catch(EOFException e){
            System.err.println("END OF STREAM");
        }
    }
}
