import java.io.*;

public class Blips{
    //主函数
    public static void main(String[] args) throws Exception{
        System.out.println("Constructing object");
        Blips1 b1 = new Blips1();
        Blips2 b2 = new Blips2();
        ObjectOutputStream out = new ObjectOutputStream(
          new FileOutputStream(
                  "//home//yang//SweetCode//Blips.out")
        );
        out.writeObject(b1);
        out.writeObject(b2);
        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(
                        "//home//yang//SweetCode//Blips.out")
        );
        System.out.println("Starting recovering");
        System.out.println("Starting recovering b1");
        b1 = (Blips1) in.readObject();
        System.out.println("Starting recovering b2");
        b2 = (Blips2) in.readObject();
    }
}
//Blips1 实现-----构造,writeExternal,readExternal
class Blips1  implements Externalizable{
    public Blips1(){
        System.out.println("Blips1 constructor");
    }
    public void writeExternal(ObjectOutput out){
        System.out.println("Blips1 writeExternal");
    }
    public void readExternal(ObjectInput in){
        System.out.println("Blips1 readExternal");
    }
}
//Blips2 实现
class Blips2  implements Externalizable{
    public Blips2(){
        System.out.println("Blips2 constructor");
    }//构造器若不为"public"对象序列化的时候会抛出异常
    public void writeExternal(ObjectOutput out){
        System.out.println("Blips2 writeExternal");
    }
    public void readExternal(ObjectInput in){
        System.out.println("Blips2 readExternal");
    }
}