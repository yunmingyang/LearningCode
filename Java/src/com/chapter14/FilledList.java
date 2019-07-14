package com.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyunming on 2018/7/31
 */
class CounterInteger{
    private static long counter;
    private final long id = counter++;
    public String toString(){return Long.toString(id);}
}
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElements){
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0 ; i < nElements;i++){
//                class类型在newInstance时候假定当前class所对应的实际对象定义中有默认构造器
//                ，否则会抛出一个异常，且编译器无任何警告
                result.add(type.newInstance());
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CounterInteger> fl = new FilledList<>(CounterInteger.class);
        System.out.println(fl.create(15));
    }
}
