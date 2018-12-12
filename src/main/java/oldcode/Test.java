public class Test {
    public static void main(String[] args){
        new AA();
    }
}
class AA{
    public static int i = 0;
    public int a = print();
    static {
        System.out.println(i);
    }
     {
        System.out.println("~~~~~~~~~~");
    }
//    {
//        i = 1000;
//        System.out.println(i);
//    }
    public int print(){
        System.out.println("---------");
        return 0;
    }
}
class BB extends AA{

}
