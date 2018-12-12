import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestRandom {
    public static void main(String[] args){
        Random rand = new Random(47);
        Map<Integer,Integer> randTest =
                new HashMap<Integer, Integer>();
        for (int i = 0;i < 10000;i++){
            int r = rand.nextInt(20);
            Integer freq = randTest.get(r);
            randTest.put(r,freq == null?1:++freq);//嵌套三目运算符
        }
        System.out.println(randTest);
    }
}
