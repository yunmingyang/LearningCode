package TestExc;

public class BenkSystem {
    //属性：余额
    private double Money;
    //属性：卡号
    private double number;


    public BenkSystem(double dollar,double number){
        this.Money = dollar;
        this.number = number;
    }
    //方法：存钱
    public void SaveMoney(double money){
        if(money >= 0) {
            Money += money;
        }
    }
    //方法：取钱
    public void HaveMoney(double money)throws MyException{
        if(money < 0 ){
            System.out.println("你是存钱！");
            throw new MyException(money);
        }



        if(Money < money){
            System.out.println("没那么多钱");
            throw new MyException(money);
        }
        else{
            Money -= money;
        }
    }
    //方法：返回余额
    public double GetMoney(){
        return this.Money;
    }
    //方法：返回卡号
    public double GetNumber(){
        return this.number;
    }
}
