public class StaticTest {

    public static int k = 0;
    public static StaticTest t1 = new StaticTest("t1");//首先加载静态变量,遇到静态new静态对象,进入对象初始化过程---即加载非静态
    //变量“public int j = print("j");”,随即调用静态print函数,非静态代码块,构造，结束
    public static StaticTest t2 = new StaticTest("t2");//与上一步相同
    public static int i = print("i");//调用静态函数print
    public static int n = 99;//为静态变量赋值,走静态代码块
    public int j = print("j");//调用print,走非静态代码块,初始化

    {
        print("构造快");
    }

    {
        print("静态块");
    }

    public StaticTest(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++n;
        ++i;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++i;
        return ++n;
    }
    public static void main(String[] args) {
        StaticTest t = new StaticTest("init");
    }

}