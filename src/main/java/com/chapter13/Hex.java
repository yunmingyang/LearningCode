package com.chapter13;



public class Hex {
    public static String format(byte[] data){
        int n = 0;
        StringBuilder sb = new StringBuilder();
        for (byte b : data){
            if (n % 16 == 0)
                sb.append(String.format("%05X: " , n));//:冒号之前内容
            sb.append(String.format("%02X " , b));
            n ++ ;
            if (n % 16 == 0) sb.append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        byte[] arr = {(byte)233,(byte)12,(byte)55,(byte)66};
        if (args.length == 0 )
            System.out.println(format(arr));
        else
            System.out.println(format(arr));
    }
}
