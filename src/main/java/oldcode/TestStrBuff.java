public class TestStrBuff {
    public static void main(String[] args){
        System.out.println("Test");
        StringBuffer sBuff = new StringBuffer("菜鸟教程官网：");
        sBuff.append("www.");
        sBuff.append("runboob.");
        sBuff.append("com");
        System.out.println(sBuff);


        sBuff.reverse();
        System.out.println(sBuff);

        sBuff.delete(0,2);
        System.out.println(sBuff);

        sBuff.insert(0,0);
        System.out.println(sBuff);

        sBuff.replace(0,2,"mo");
        System.out.println(sBuff);
    }
}
