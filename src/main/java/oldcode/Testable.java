public class Testable {
    public @Test  int i ;
    public void excute(){
        System.out.println("Excuting");
    }
    /*@Test*/ void TestExcute(){
        excute();
    }
}
