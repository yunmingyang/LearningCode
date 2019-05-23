package com.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheReplacement {
    private static String str = "/*!  Here's a block of text to use as input to the regular expression matcher." +
            "Note that we'll first extract the block of text by looking for the special delimiters.then process" +
            "the extracted block.  !*/";

    public static void main(String[] args) {
//        18章内容，暂时直接使用字符串
//        String s = TextFile.read("TheReplacements.java");
        Matcher Input = Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(str);
        System.out.println(Input.groupCount());
        if (Input.find()){
            System.out.println("group 0 : " + Input.group(0) + "\n" + "group 1 :" + Input.group(1));
            str = Input.group(1);
        }
        str = str.replaceAll(" {2,}"," ");
        str = str.replaceAll("(?m)^ +","");
        System.out.println(str);
        str = str.replaceFirst("[aeiou]","(VOWEL1)");
        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(str);
        System.out.println(m.groupCount());
        while (m.find()){
            //String repalceAll只能讲匹配替换成一个字符不能根据当前捕获组所捕获的字符进行针对性操作
            //字符串比较要使用重载后的equal，否则会一直false
            if (m.group().equals("e")){
                m.appendReplacement(sb,m.group().toUpperCase());
            }
            System.out.println("group catch: " + m.group() + " position at " + m.start() + " - " + m.end());
        }
        m.appendTail(sb);
        System.out.println(sb);

//        System.out.println(sb.toString().replaceAll("[AEIOU]","[aeiou]"));
    }
}
