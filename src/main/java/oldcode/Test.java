import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args){
        Pattern pattern =Pattern.compile("^(-|\\+)?\\d*\\D");
        System.out.println(pattern.matcher("-100a").matches());


    }
}
