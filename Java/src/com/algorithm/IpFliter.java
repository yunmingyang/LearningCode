package someofinteresting;

import java.util.regex.Pattern;

public class IpFliter {
    public static String fliter(String[] rules, String IP){
        boolean match = false;
        for (String rule: rules){
            match = Pattern.matches(rule, IP);
            if(match)break;
        }
        if(match)return IP + ": 该条IP会被过滤";
        return IP + ": 该条IP不会被过滤";
    }

    public static void main(String[] args) {
        String[] rules = {"192.168.1.*"};
        for (int i = 0 ; i < rules.length; i++) {
            rules[i] = rules[i].replace("*",".*");
        }
        System.out.println("The rules is:");
        for (String rule:
             rules) {
            System.out.println(rule);
        }
        String IP = "192.168.1.28";
        System.out.println(fliter(rules, IP));
    }
}
