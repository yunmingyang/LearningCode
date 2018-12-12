import java.util.Arrays;
import java.util.List;

public abstract class TestClass {
    public static void main(String[] args){
        List<Shape> shapeList = Arrays.asList(
                new Circle(),
                new Trangle(),
                new Square()
        );
        for (Shape shape : shapeList)
            shape.draw();
    }
}
abstract class Shape{
    public void draw(){
        System.out.println(this.toString() + ".draw()");
    }
    public abstract String toString();
}
class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}
class Trangle extends Shape{
    @Override
    public String toString() {
        return "Trangle";
    }
}
class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}