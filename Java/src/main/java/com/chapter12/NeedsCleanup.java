package com.chapter12;

public class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter ++;
    public void dispose(){
        System.out.println("NeedsCleanup " + id + "disposed");
    }


    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {

        }finally {
            nc1.dispose();
        }


        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {

        }finally {
            nc2.dispose();
            nc3.dispose();
        }


        //当构造可能失败时候，编程就会变得很复杂，必须在每一个对象构造都跟着一个try ... finally
        //若dispose也抛出异常的话，那就必须要额外的try语句块
        //尽可能创建不失败的构造器
        //应考虑尽可能多的可能性
        try{
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try{
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try{

                }finally {
                    nc5.dispose();
                }
            }catch (ConstructionException e){
                System.out.println(e);
            }finally {
                nc4.dispose();
            }
        }catch (ConstructionException e){
            System.out.println("Construction failed");
        }
    }
}

class ConstructionException extends Exception{}
class NeedsCleanup2 extends NeedsCleanup {
    public NeedsCleanup2() throws ConstructionException{}
}


