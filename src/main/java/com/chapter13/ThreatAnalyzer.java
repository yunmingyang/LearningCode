package com.chapter13;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class ThreatAnalyzer {
    private static String threatData = "58.27.82.161@02/10/2005," +
            "204.45.234.40@02/11/2005," +
            "58.27.82.161@02/11/2005," +
            "58.27.82.161@02/12/2005," +
            "58.27.82.161@02/12/2005," +
            "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        Pattern p = Pattern.compile("(\\d+[.]\\d+[.]\\d+[.]\\d+)@" + "(\\d{2}/\\d{2}/\\d{4})");
//        根据scanner的输入分词进行匹配
        scanner.useDelimiter(",");
        while (scanner.hasNext(p)){
            scanner.next(p);
            MatchResult mr = scanner.match();
            String ip = mr.group(1);
            String date = mr.group(2);
            System.out.format("Threat on %s from %s \n" ,date,ip);
        }
    }
}
