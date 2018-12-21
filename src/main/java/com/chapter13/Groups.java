package com.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static final String POEM =
            "Twas brillig, and the slithy tovwa\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were thr borogves,\n"+
            "And the mome raths outgrabe.\n\n"+
            "Beware the Jabberwock , my son,\n"+
            "The jaws that bite, the claws that catch.\n"+
            "Beware the Jubjubbird, and shun\n"+
            "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
        while(m.find())
            for (int j = 0 ; j < m.groupCount() ; j ++){
                System.out.println("[" + m.group(j) + " ]");
            }
    }
}
