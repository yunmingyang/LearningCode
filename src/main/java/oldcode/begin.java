package oldcode;

public class begin {
    public static void main(String[] args){
        BenkSystem yang = new BenkSystem(100000,29388822231231231231231d);

        System.out.println(yang.GetMoney());
        System.out.println(yang.GetNumber());


        yang.SaveMoney(100000);
        System.out.println(yang.GetMoney());
        try {
            yang.HaveMoney(100000);
            System.out.println(yang.GetMoney());

            yang.HaveMoney(1000000);
            System.out.println(yang.GetMoney());

        }catch(MyException e){
            System.out.println("取超了");
            System.out.println(e.GetCount());
        }
    }
}
