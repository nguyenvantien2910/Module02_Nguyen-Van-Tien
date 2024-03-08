package BTNV02;

import java.util.Scanner;

public class QuadraticEquation {
    private Double a, b, c;

    public QuadraticEquation() {};
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setC(Double c) {
        this.c = c;
    }

    double delta;

    public double getDiscriminant() {
        delta = 2 * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.pow(delta, 0.5) / 2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.pow(delta, 0.5) / 2 * a);
        return r2;
    }
    Scanner scanner = new Scanner(System.in);
    public void getData(Scanner scanner) {
        System.out.println("Moi ban nhap gia tri cho a: ");
        this.a = Double.parseDouble(scanner.next());

        System.out.println("Moi ban nhap gia tri cho b: ");
        this.b = Double.parseDouble(scanner.next());

        System.out.println("Moi ban nhap gia tri cho c: ");
        this.c = Double.parseDouble(scanner.next());
    }
}
