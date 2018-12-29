package com.chapter14.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by yangyunming on 2018/8/1
 */
public abstract class PetCreator {
    private Random random = new Random(47);
    //设计模式：模板模式
    public abstract List<Class<? extends Pet>> types();
    public Pet randomPet(){
        int n = random.nextInt(types().size());
        try{
            return types().get(n).newInstance();
        }catch (InstantiationException e){
            throw new RuntimeException(e);
        }catch (IllegalAccessException e){
//            此异常使用于jdk1.7 或者更高
//            当构造器私有时候，有可能会抛出此异常
            throw new RuntimeException(e);
        }
    }
    public Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for (int i = 0;i < size; i++)
            result[i] = randomPet();
        return  result;
    }
    public ArrayList<Pet> arrayList(int size){
//        设置上线，因此不需要转型就可以未Pet类型
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result,createArray(size));
        return result;
    }
}
