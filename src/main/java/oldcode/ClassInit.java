public class ClassInit {

    /**
     * @Title:       main
     * @Description:   类初始化顺序测试
     * @param:       @param args
     * @return:     void
     * @throws
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new B();
    }

}

class A {
    static{
        System.out.println("A的static代码块...");
    }
    public String s1 = prtString("A的成员变量...");
    public static String s2 = prtString("A的static变量...");
    public A(){
        System.out.println("A的构造函数...");
    }
    {
        System.out.println("代码块" );
    }

    public static String prtString(String str) {
        System.out.println(str);
        return null;
    }
}

class B extends A{
    public String ss1 = prtString("B的成员变量...");
    static{
        System.out.println("B的static代码块...");
    }
    public static String ss2 = prtString("B的static变量...");
    public B(){
        System.out.println("B的构造函数...");
    }
    private static A a = new A();
    static{
        System.out.println("B的static代码块...");
    }
    {
        System.out.println("代码块...");
    }
}
//1.父类的静态成员，包括静态方法和静态变量，顺序执行
//2.子类的静态成员，包括静态方法和静态变量，顺序执行
//3.父类的成员变量和构造函数，先变量后函数
//4.子类的成员变量和构造函数，先变量后函数
//5.代码块先于构造函数执行
//6.加载静态成员时，若创建对象，那么进入创建对象流程，此时只加载成员变量，代码块以及构造函数