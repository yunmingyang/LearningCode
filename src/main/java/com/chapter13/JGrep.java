package com.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) throws Exception{
        if (args.length < 2){
            System.out.println("Usage: " + " \n" + "\t" +"java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
//        空的matcher对象，会有一定的性能优化
//        todo:chapter 18
        Matcher m = p.matcher("");
//        for (String line:
//             new TestFile(args[0])) {
//            m.reset(line);
//            while (m.find())
//                System.out.println(index ++ + ": " + m.group() + ": " + m.start());
//        }
    }
}
