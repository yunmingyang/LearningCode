package com.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yangyunming on 2018/7/27
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Usage:\n" +
                    "java TestRegularExpression" +
                    "characterSequence regularExpression");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg: args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern pattern = Pattern.compile(arg);
            Matcher matcher = pattern.matcher(args[0]);
            while(matcher.find()){
                System.out.println("Match \"" + matcher.group() + "\"at positions " + matcher.start() + "-" + matcher.end());
            }
        }
    }
}
