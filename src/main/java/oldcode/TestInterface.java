public class TestInterface {
    public static void  main(String[] args){
        A a = new A();
        a.msg();
        PrintTest.msssgggg();
        a.het();
        a.run();
    }


}


interface PrintTest{
    int min = 0;
    int max = 0;
    void run();
    void het();
    default void msg(){
        System.out.println("ooooohh~~~");
    }

    static void msssgggg(){
        System.out.println("youuuuuu~~~");
    }
}


abstract class AbTest implements PrintTest{
    //@Override
    //public void het() {

    //}
}


class A extends AbTest{
    public void run(){
        System.out.println("run");
    }
    public void het(){
        System.out.println("fly");
    }
}
