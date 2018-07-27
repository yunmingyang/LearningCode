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
    public StromyInning()throws RainedOut,BaseballException {}
    public StromyInning(String s)throws RainedOut,BaseballException{}
//    public void walk() throws Foul{}//基类无异常抛出，所以此处会报错
//导出类可以不抛出异常，或者基类中没有的方法可以抛出任意异常，否则就应该抛出基类中该方法定义好的异常
    public void atBat(){ }
    public void rainHard(){}
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
//且由于异常不属于方法的一部分，所以不可以用异常来重载方法
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
