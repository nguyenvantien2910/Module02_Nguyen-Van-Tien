package SS08.BTVN05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Diện tích của các hình tam giác :");
        System.out.println(StaticMethod.calTriangleArea(3, 4, 5));
        System.out.println(StaticMethod.calTriangleArea(4.5, 7, 6));

        System.out.println("Diện tích của các hình vuông :");
        System.out.println(StaticMethod.calRectangleArea(2.5, 6));
        System.out.println(StaticMethod.calRectangleArea(4, 7));

        System.out.println("Diện tích của các hình tròn :");
        System.out.println(StaticMethod.calCircleArea(3.5));
        System.out.println(StaticMethod.calCircleArea(6));
    }
}
