package com.chapter14.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyunming on 2018/8/1
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "com.chapter14.pets.Mutt",
            "com.chapter14.pets.Pug",
            "com.chapter14.pets.EgyptianMau",
            "com.chapter14.pets.Manx",
            "com.chapter14.pets.Cymric",
            "com.chapter14.pets.Rat",
            "com.chapter14.pets.Mouse",
            "com.chapter14.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name : typeNames){
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static {loader();}
    public List<Class<? extends Pet>> types(){
        return types;
    }
}
