package SS09.BTVN04;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red", 4.5F, 6F);
        System.out.println("Diện tích của hình vuông là : " + rectangle.getArea());
        System.out.println(rectangle);

        Circle circle = new Circle(5.9F);
        System.out.println("Diện tích của hình tròn là :" + circle.getArea());
        System.out.println(circle);

    }
}
