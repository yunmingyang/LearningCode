import java.util.*;

public class CreaterTest {
    private static List<String> nameList   = new ArrayList<String>() {};
    private static int i;

    static {
        nameList.add("生死时速");
        nameList.add("源代码");
        nameList.add("猩球崛起");
    }

    public String next() {
        if (i  == nameList.size()) i = 0;
        return nameList.get(i++);
    }

    public static void main(String[] args) {
        CreaterTest CT = new CreaterTest();
        for (int i = 0;i < 4;i++)
            System.out.println(CT.next());
        String[] arr = {CT.next(),CT.next(),CT.next(),CT.next()};
    }
}
