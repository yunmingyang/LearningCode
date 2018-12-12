interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy1{
    Toy1(){}
    Toy1(int i){}
}
class FancToy extends Toy1{
    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName()
                +"is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName() );
    }
}

public class Toy {
    public static void main(String[] args){
        Class c = null;
        try{
            c = Class.forName("FancToy");
        }catch(ClassNotFoundException e){
            System.out.println("Can't find FancToy");
            System.exit(1);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        }catch(InstantiationException e){
            System.out.println("Cannot instantiate");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("Cannot access");
            System.exit(1);
        }
    }

}

