import java.util.LinkedList;

public class StackTest<T> {
    private LinkedList<T> sotrage = new LinkedList<T>();
    public void push(T v){ sotrage.addFirst(v); }
    public T pop(){ return sotrage.removeFirst(); };
    public T peek(){ return sotrage.getFirst(); };
    public boolean isEmpty(){ return sotrage.isEmpty(); };
    public String toString(){ return sotrage.toString(); };

    public static void main(String[] args){
        StackTest<String> st = new StackTest<String>();
        for(String s : "My dog has fleas".split( " ")){
            st.push(s);
        }
        while (! st.isEmpty()){
            System.out.println(st.pop() + " ");
        }
    }
}
