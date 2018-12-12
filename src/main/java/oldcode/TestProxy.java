import java.io.Serializable;

public class TestProxy implements Serializable {
    TestProxy(int i){
        System.out.print(i);
    }
}
