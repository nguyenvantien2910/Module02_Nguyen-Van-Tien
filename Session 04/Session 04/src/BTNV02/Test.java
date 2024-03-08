package BTNV02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuadraticEquation pt1 = new QuadraticEquation(4,5,6);

        if (pt1.delta > 0) {
            System.out.printf("Nghiem 1 của phương trình là : %.2f", pt1.getRoot1());
            System.out.printf("Nghiem 2 của phương trình là : %.2f", pt1.getRoot2());
        } else if (pt1.delta == 0 ) {
            System.out.printf("Nghiem của phương trình là : %.2f", pt1.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
