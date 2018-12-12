public class TestFinalVar {
//    static final int data;
//    static {
//        data = 100;
//    }
    final int data;
    TestFinalVar(){
        //静态构造函数不被allow
        //data = 100;
    }
    {

        data = 100;
    }


    void TestFinal(final int n){
       // n = n * n;
        System.out.println("n is :" + n);
    }

    public static void main(String[] args){
        TestFinalVar tf = new TestFinalVar();
        System.out.println("data is : " + tf.data);
        tf.TestFinal(5);
    }
}
