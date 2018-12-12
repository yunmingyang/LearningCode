import java.util.ArrayList;
import java.util.List;

public class TestCheck<T>{
    private Class<T> type;
    public TestCheck(Class<T> type){
        this.type = type;//构造中传入Class用于编译时安全检查
    }
    public List<T> create(int Elements){
        List<T> result = new ArrayList<T>();
        try{
            for (int i=0;i < Elements; i++)
                result.add(type.newInstance());//虚拟构造器构造
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args){
        TestCheck<CountedInteger> TC = new
                TestCheck<CountedInteger>(CountedInteger.class);
        System.out.println(TC.create(15));
    }
}

class  CountedInteger{
    private static long counter;
    private final long id = counter++;
    public String toString(){ return Long.toString(id); }
}
