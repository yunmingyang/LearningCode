import java.io.*;


public class Blips3 implements Externalizable{
    //私有int变量i
    private int i;
    //私有String变量s
    private String s;
    //无参构造,打印信息
    public Blips3(){
        System.out.println("Blips3 construct");
    }
    //有参构造,传入变量s和i
    public Blips3(String s ,int i){
        System.out.println(
                "Blips3 construct:s=" + s + " i=" + i);
        this.s = s;
        this.i = i;
    }
    //toString方法
    public String toString(){return s + " " + i;}
    //writeExternal
    public void writeExternal(ObjectOutput out) throws IOException{
        System.out.println("start writeExternal");
        out.writeObject(s);
        out.writeObject(i);
    }
    //readExternal
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
        System.out.println("start readExternal");
        s = (String) in.readObject();
        i = (Integer) in.readObject();//书上说的可能有问题,因为若此时使用readInt()直接读取
        //那么会抛出EOFExecption,所以此处使用readObjec()方法后,转型为int的包装类,可正确获取
        //且此处必须进行此数据恢复步骤,因为调试发现反序列化后,走的默认初始化,所以会造成数据的丢失
    }
    //主函数
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        System.out.println("start construct object");
        Blips3 ps = new Blips3("A String",47);
        System.out.println(ps);

        //序列化
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("//home//yang//SweetCode//1.txt")
        );
        o.writeObject(ps);
        o.close();

        //反序列化
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("//home//yang//SweetCode//1.txt")
        );
        ps = (Blips3)in.readObject();
        System.out.println(ps);

    }
}
