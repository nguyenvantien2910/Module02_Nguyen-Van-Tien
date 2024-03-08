package BTVN01;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setColor("red");
        circle1.setRadius(5.6F);

        Circle circle2 = new Circle(7.6F,"black");

        circle1.chuVi();
        circle2.dienTich();
        circle1.displayData();
    }
}
