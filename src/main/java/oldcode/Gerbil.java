import java.util.ArrayList;

public class Gerbil {
    public static int noOfGerbil ;
    public int No;
    public  Gerbil(){
        noOfGerbil++;
        setNo();
    }
    public Gerbil setNo(){
        No = noOfGerbil;
        return this;
    }
    public void hop(){
        System.out.println("The Gerbil no. is " + No);
    }
    public static void main(String[] args){
        Gerbil g1 = new Gerbil();
        g1.hop();
        Gerbil g2 = new Gerbil();
        g2.hop();

        ArrayList<Gerbil> a1 = new ArrayList<Gerbil>();
        a1.add(g1);
        a1.add(g2);
        for (Gerbil c: a1) {
            c.hop();
        }
    }
}
