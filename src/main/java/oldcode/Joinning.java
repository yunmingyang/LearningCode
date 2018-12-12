public class Joinning {
    public static void main(String[] args){
        Sleeper sleepy = new Sleeper("Sleepy",150);
        Sleeper grumy = new Sleeper("Grumy",150);
        Joiner dopey = new Joiner("Dopey",sleepy);
        Joiner doc = new Joiner("Doc",grumy);
        grumy.interrupt();
    }
}
class Joiner extends Thread{
    private Sleeper sleeper;
    public Joiner(String name,Sleeper sleeper){
        super(name);
        this.sleeper = sleeper;
        start();
    }
    public void run(){
        try {
            sleeper.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(getName() + "join completed");
    }
}
class Sleeper extends Thread{
    private int duration;
    public Sleeper(String name,int sleepTime){
        super(name);
        duration = sleepTime;
        start();
    }
    public void run(){
        try{
            sleep(duration);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(getName() + "has awakened");
    }
}