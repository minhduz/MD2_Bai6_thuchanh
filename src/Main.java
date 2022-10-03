import AllShape.Circle;
import AllShape.Rectangle;
import AllShape.Shape;
import AllShape.Square;

public class Main{
    public static void main(String[] args) {
//Kiểm thử Class Shape
        System.out.println("---------SHAPE----------");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);
        System.out.println("");

//kiểm thử Class Circle
        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("purple",false,3.5);
        System.out.println(circle);
        System.out.println("");

//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5,3);
        System.out.println(rectangle);
        rectangle = new Rectangle("yellow",false,5,8);
        System.out.println(rectangle);

//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.5);
        System.out.println(square);
        square = new Square("black",false,4.5);
        System.out.println(square);
    }
}
