package com.chapter14;

import com.chapter14.pets.Pet;
import com.chapter14.pets.PetCreator;

import java.util.ArrayList;

//外观模式
public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
