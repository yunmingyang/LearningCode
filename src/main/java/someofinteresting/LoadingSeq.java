package someofinteresting;

public class LoadingSeq {
    int a = 11;
    static int b = 1233;
    static LoadingSeq ls = new LoadingSeq();
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }//新实例被创建的时候会执行，优先级优于构造函数
    public static void staticFunction(){
        System.out.println("4");
    }
    LoadingSeq(){
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void main(String[] args) {
        new LoadingSeq();
        staticFunction();
    }
}
