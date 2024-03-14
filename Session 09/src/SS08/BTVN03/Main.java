package SS08.BTVN03;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(56, 80);
        MoveablePoint moveablePoint = new MoveablePoint(60,34,50,35);

        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
