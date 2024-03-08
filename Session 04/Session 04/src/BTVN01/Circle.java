package BTVN01;

import java.util.Scanner;

public class Circle {
    private Float radius;
    private String color;

    public Circle() {}

    public Circle(Float radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    // Getter & Setter
    public String getColor() {
        return color;
    }

    public Float getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    // Method
    public void chuVi() {
        System.out.printf("Chu vi cua hinh tron co banh kinh %.2f la: %.2f\n", radius, 2 * Math.PI * radius);
    }

    public void dienTich() {
        System.out.printf("Dien tich cua hinh tron co ban kinh %.2f la: %.2f\n", radius, Math.PI * radius * radius);
    }

    public void displayData() {
        System.out.printf("Ban kinh cua hinh tron la : %.2f\n", radius);
        System.out.printf("Mau cua hinh tron la : %s\n", color);
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap banh kinh cua hinh tron: ");
        this.radius = Float.parseFloat(scanner.nextLine());

        System.out.println("Moi ban nhap mau cua hinh tron: ");
        this.color = scanner.nextLine();
    }
}
