public class TestCharacter {
    public static void main(String[] args){
        System.out.println("HelloWorld!");
        //Character ch = new Character('a');
        //Character ch1 = new Character('A');
        //Character ch2 = new Character(' ');
        //Character ch3 = new Character('1');


        System.out.println("result is :" + Character.isLetter('A'));
        System.out.println("result is :" + Character.isWhitespace(' '));
        System.out.println("result is :" + Character.isLowerCase('a'));
        System.out.println("result is :" + Character.isDigit('1'));
    }
}
