import java.util.Date;

public class TestDate {
    public static void main(String[] main){
        Date mDate = new Date(10000000000000l);
        System.out.println("Date is : " + mDate.toString());


        Date m1 = new Date();
        Date m2 = new Date();
        System.out.println(m1.after(m2));
        System.out.println(m1.before(m2));
        System.out.println(m1.compareTo(m2));
        System.out.println(m1.getTime());


        Date m3 = new Date();
        m3.setTime(m1.getTime());
        System.out.println(m1.compareTo(m3));
    }
}
