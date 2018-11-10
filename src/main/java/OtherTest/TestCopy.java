package OtherTest;

public class TestCopy {
    public static void main(String[] args) {
        Node node = new Node();
        node.setVal(1);
        System.out.println(node.getVal());


        Node copy1 = node;
        System.out.println(copy1.getVal());

        node.setVal(2);
        System.out.println(copy1.getVal());


        Node copy2 = copy1;
        copy2.setVal(3);
        System.out.println(copy1.getVal());

        copy1 = null;
        System.out.println(copy2.getVal());

        //System.out.println(copy1.getVal());//由于已经赋值为null,所以此处报空指针异常
    }
}
class Node{
    private int val;

    int getVal(){
        return val;
    }


    void setVal(int val){
        this.val = val;
    }
}
