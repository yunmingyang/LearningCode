public class AggregationTest {
    Operation op;
    double pi =3.14;

    double area(int radius){
        op = new Operation();
        int rsquare = op.square(radius);
        return pi*rsquare;
    }


    public static void main(String[] args){
        AggregationTest a = new AggregationTest();
        double result = a.area(5);
        System.out.println(result);
    }
}

class Operation{
    int square(int a){
        System.out.println(a);
        return a*a;
    }
}
