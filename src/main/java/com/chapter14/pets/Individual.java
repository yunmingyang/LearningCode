package com.chapter14.pets;


/**
 * Created by yangyunming on 2018/8/1
 */
public class Individual {
    //todo：chapter17 toString
    private final int counter = id++;
    private static int id = 0;
    private String name  = null;
    public Individual(){
    }
    public Individual(String name){
        this.name = name;
    }
    public int id(){return counter;}
}
