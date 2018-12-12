import java.io.*;
import java.util.Date;

public class Logon implements Serializable {
    //私有Date变量
    private Date date = new Date();
    //String username
    private String username;
    //String password ------ transient
    private /*transient*/ String password;//瞬时关键字,防止使用Serializable的全部序列化
    //不会保存到磁盘,反序列化也不会尝试去反序列化它
    //Externalizable默认不保存任何字段
    //所以transient与Serializable一起使用
    //在Serializable中实现writeObject和readObject可以达到和Externalizable一样的效果
    //公有构造,传入name和pwd两个参数
    public Logon(String name,String pwd){
        this.password = pwd;
        this.username = name;
    }
    //toString方法
    public String toString(){
        return "logon info:\n username" + username + "\n date:" + date
                + "\n password:" + password;
    }
    //主函数
    public static void main(String[] args) throws Exception{
        Logon l = new Logon("yang","1234567");
        System.out.println("logon yang = " + l);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(".//logon.out")
        );
        out.writeObject(l);
        out.close();


        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(".//logon.out")
        );
        l = (Logon) in.readObject();
        System.out.println("Recover at :" + new Date() + l);
    }
}
