package BTVN04;

public class Test {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, "Yellow", 10, true);
        Fan fan2 = new Fan(1, "Blue", 20, false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
