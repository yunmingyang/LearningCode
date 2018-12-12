public class Pair<T> {
    private T first;
    private T second;

    Pair(){first = null ;second = null;}
    Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    T getFirst(){return first;}
    T getSecond(){return second;}

    void setFirst(T value){first = value;}
    void setSecond(T value){second = value;}
}
