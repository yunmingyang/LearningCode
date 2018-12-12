public class Value {
    static int allClicks = 0; //类变量，生命周期类加载。必须在方法、构造方法和语句块之外。
                              //无论创建多少对象，类只拥有类变量的一份拷贝
                              //静态变量除了被声明为常量外很少使用，常量是指声明为public/private，final和static类型的变量。常量初始化
                              //后不可改变。
                              //静态变量存在静态存储区。在程序开始时创建，在结束时销毁
                              //有默认值
                              //可通过完全限定名访问
                              //类变量声明为public static final类型时，类变量名称一般建议使用大写字母。
                              //
    static final int alwaysValue = 1000;


    String str="hello World!"; // 实例变量，生命周期对象实例化，应至少有一个方法、构造方法或者语句块引用，实例变量可以生命在使用前或者使用
                               // 后，访问修饰符可以修饰实例变量，具有默认值。可以直接通过变量名访问名访问。但在静态方法以及其它类中，就需
                               // 要使用完全限定名

    public void method(){
        int i = 0; //局部变量，生命周期为方法，分配在栈上，访问修饰符不能用于局部变量，无默认值故必须初始化
        System.out.println("常量:" + this.alwaysValue);
    }


    public static void main(String[] args){
        Value v1 = new Value();

        v1.method();
    }
}
