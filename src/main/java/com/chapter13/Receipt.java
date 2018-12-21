package com.chapter13;



import java.util.Formatter;
import java.util.regex.Pattern;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);


    public void printTitle(){
        f.format("%-15s %5s %10s\n","ITEM","QTY","PRICE");
        f.format("%-15s %5s %10s\n","----","---","-----");
    }

    public void print(String name,int qty,double price){
        f.format("%-15.15s %5s %10.2f\n",name,qty,price);
        total += price;
    }

    public void printTotal(int length){
        String formatTAX = "%-" + length + "s " + "%5s " + "%10.2f\n";
        f.format(formatTAX,"TAX","",total * 0.06);
        f.format("%-15s %5s %10s\n","","","-----");
        f.format("%-15s %5s %10.2f\n","Total","",
                total * 1.06);
    }

    public static void main(String[] args) {
//        Receipt receipt = new Receipt();
//        receipt.printTitle();
//        receipt.print("Jack's Magic Beans",4,4.25);
//        receipt.print("Princess Peas",3,5.1);
//        receipt.print("Three Bears Porridge",1,14.29);
//        receipt.printTotal(15);

        System.out.println(Pattern.matches("^\\w*$"," "));
        System.out.println(Pattern.matches("^\\w*$","ssss"));

    }
}
