package OtherTest;

import java.util.LinkedList;

public class MLRU {
    private static int length;
    private static LinkedList<String> lru_List;

    public MLRU(){}

    public void read(String str){
        //空则填入
        if (lru_List == null){
            lru_List = new LinkedList<String>(){
                {
                    add(str);
                }
            };
        }
        //挪动到末尾
        if(lru_List.contains(str)){
            int index = lru_List.indexOf(str);
            String temp = lru_List.get(index);
            lru_List.remove(index);
            lru_List.addLast(str);
            length ++ ;
        }else if(!lru_List.contains(str) && length < 10){
            //尾添加
            lru_List.addLast(str);
        }else if(!lru_List.contains(str)  && length == 10){
            //清理最老元素
            lru_List.removeFirst();
            lru_List.addLast(str);
        }
    }

    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//////        System.out.println(list.getFirst());
////        list.add("1");
////        System.out.printf(list.getFirst());
    }
}
