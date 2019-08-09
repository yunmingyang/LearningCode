package com.chapter5;

public class FinalizeGC {
    protected void finalize(){
        // 对象被清理时候会被调用
        // jdk11里面已经标记为即将丢弃的方法
        System.out.println("the finalize");
    }

    public static void main(String[] args) {
        FinalizeGC f1 = new FinalizeGC();
        f1 = null;

        System.gc();
    }
}
