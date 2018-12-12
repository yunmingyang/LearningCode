import java.util.*;

public class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c){ super(c); }
    public Iterable<T> reversed(){
        return new Iterable<T>(){
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext(){ return  current > -1;}
                    public T next(){ return get(current--); }
                    };
                }
            };
        }
        public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<String>(
                        Arrays.asList("s a d f w".split(" "))
                );
                Collections.shuffle(shuffled,new Random(47));
                return shuffled.iterator();
            }
        };
        }

    public static void main(String[] args){
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
                Arrays.asList("To be No.1".split(" "))
        );

        for (String s : ral)
            System.out.println(s + " ");


        for (String s : ral.reversed())
            System.out.println(s + " ");

        for (String s : ral.randomized())
            System.out.println(s +" ");
    }
}
