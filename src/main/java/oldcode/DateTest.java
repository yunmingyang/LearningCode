import java.text.SimpleDateFormat;
import java.util.Date;





public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        Date date1 = new Date();
        if (date1.after(date))
            System.out.println("yes");
        else
            System.out.println("wrong");


        SimpleDateFormat Sdt = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current time: " + Sdt.format(date));
        System.out.println("Current time: " + Sdt.format(date1));


    }
}