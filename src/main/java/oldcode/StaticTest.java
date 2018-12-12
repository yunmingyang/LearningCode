public class StaticTest {
    private static int numInstances = 0;
    protected static int getNumInstances(){
        return numInstances;
    }

    private static void addInstances(){
        numInstances++;
    }
    StaticTest(){
        StaticTest.addInstances();
    }


    public static void main(String[] args){
        System.out.println("Startinh with " + StaticTest.getNumInstances() + " instances");
        for(int i = 0;i < 500; i++){
            new StaticTest();
            //final int l = 0 ;
            //System.out.println("创建常量： " + l);
        }
        System.out.println("Created " + StaticTest.getNumInstances() + " Instances");


        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        a++;
        System.out.println("a++   = " + a);
        a--;
        System.out.println("a--   = " + a);
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );



    }
}
