public class TestCodeBlock {
    int var = 0;
    TestCodeBlock(){
        System.out.println("var is:" + var);
    }

    {
        var = 100;
    }

    void pr(){
        System.out.println("var is:" + var);
    }

    public static void main(String[] args){
        TestCodeBlock tc = new TestCodeBlock();
        tc.pr();
    }
}
