package SS09.rikkei.academy;

import ThucHanh01.rikkei.academy.animals.Animal;
import ThucHanh01.rikkei.academy.animals.Chicken;
import ThucHanh01.rikkei.academy.edible.IEdible;

public class Main {
    public static void main(String[] args) {
//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        // Kiểm thử Resizeable:
        circle.resize(1.25);
        System.out.println("Circle after resizing:");
        System.out.println(circle);
        System.out.println("-------------------");


        rectangle.resize(1.5);
        System.out.println("Rectangle after resizing:");
        System.out.println(rectangle);
        System.out.println("-------------------");


        square.resize(1.75);
        System.out.println("Square after resizing:");
        System.out.println(square);

        // Kiểm thử Colorable
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.9);
        shapes[1] = new Square(3.8, "red", true);
        shapes[2] = new Rectangle(5.6, 9.3, "green", false);

        for (Shape shape1 : shapes) {
            System.out.println(shape1.toString());

            if (shape1 instanceof Colorable) {
                Colorable colorable = (Colorable) shape1;
                System.out.println(colorable.howToColor());
            }
        }
    }
}
