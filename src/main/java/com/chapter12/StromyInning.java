package com.chapter12;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * Created by yangyunming on 2018/7/26
 */
class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends Foul{}

abstract class Inning{
    public Inning() throws BaseballException{}
    public void event() throws BaseballException{}
    public abstract void atBat() throws Strike,Foul;
    public void walk(){}
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}
interface Storm{
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
public class StromyInning extends Inning implements Storm {
    public StromyInning()throws RainedOut,BaseballException {}//由于需要调用父类构造所以此处需要将父类抛出的异常写在异常列表中
    public StromyInning(String s)throws Foul,BaseballException{}
//    void walk(){}//访问修饰符需要大于父类中函数定义处的访问修饰符
//    public void walk() throws Foul{}//基类无异常抛出，所以此处会报错
    public void atBat() throws PopFoul{}//
    public void rainHard(){}
//    书中原话---接口不能对base类中已存在的方法添加异常，那么此处方法其实对base类中相应方法的重写，所以此处要么不抛异常，要么抛出base相同或者派生异常
//    public void event() throws RainedOut{}
    public void event(){}

    public static void main(String[] args) {
        try{
            StromyInning s1 = new StromyInning();
        }
//非多态只捕获当前类抛出的异常
//        catch (PopFoul e){
//            System.out.println("Pop foul");
//        }
        catch (RainedOut e){
            System.out.println("Rained Out");
        }catch (BaseballException e){
            System.out.println("Generic baseball exception");
        }
//若使用多态，则需要捕获其基类的异常
        try{
            Inning i = new StromyInning();
        }catch(Strike e){
            System.out.println("Strike");
        }catch (Foul e){

        }catch (RainedOut e){

        }catch (BaseballException e){

        }
    }
}
