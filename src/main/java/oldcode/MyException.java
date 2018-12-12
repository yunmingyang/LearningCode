package oldcode;

public class MyException extends Exception{
    private double mCount;
    public MyException(double mCount){
        this.mCount = mCount;
    }
    public double GetCount(){
        return mCount;
    }
}
