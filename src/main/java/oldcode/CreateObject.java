public class CreateObject {
    public CreateObject(String obj){
        System.out.print("start:"+obj);
    }


    public static void main(String[] args){
        CreateObject obj = new CreateObject("hello");
    }
}
