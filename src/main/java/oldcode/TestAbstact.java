public class TestAbstact {
    public static void main(String[] args){
        Shape a = new Circle();
        a.draw();
    }
}


abstract class Shape{
    abstract void draw();
}


class Rectangle extends Shape{
    void draw(){
        System.out.println("you draw a Rect");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("you draw a Circle");
    }
}
