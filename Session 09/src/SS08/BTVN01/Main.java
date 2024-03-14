package SS08.BTVN01;

public class Main {
    public static void main(String[] args) {

        Circle[] circles = new Circle[2];
        circles[0] = new Circle(3.7, "Red");
        circles[1] = new Circle(6.5, "Yellow");

        System.out.println(circles[0]);;
        System.out.println(circles[1]);;
        System.out.println("------------------------");;

        Cylinder[] cylinders = new Cylinder[2];
        cylinders[0] = new Cylinder(6.7, 8.3);
        cylinders[1] = new Cylinder(7.5, 3.3);

        cylinders[0].calVolume();
        cylinders[1].calVolume();

        System.out.println(cylinders[0]);
        System.out.println(cylinders[1]);
        System.out.println("------------------------");;
    }
}
