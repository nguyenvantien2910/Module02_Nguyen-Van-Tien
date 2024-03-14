package SS08.BTVN02;

public class Main {
    public static void main(String[] args) {
        Point2D[] point2Ds = new Point2D[2];
        point2Ds[0] = new Point2D(80, 45);
        point2Ds[1] = new Point2D(30, 50);

        System.out.println(point2Ds[0]);
        System.out.println(point2Ds[1]);
        System.out.println("-------------------------");


        Point3D[] point3Ds = new Point3D[2];
        point3Ds[0] = new Point3D(80, 45, 60);
        point3Ds[1] = new Point3D(30, 50, 41);

        System.out.println(point3Ds[0]);
        System.out.println(point3Ds[1]);
        System.out.println("-------------------------");

    }
}
