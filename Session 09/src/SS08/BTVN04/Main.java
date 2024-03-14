package SS08.BTVN04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập vao canh 1 của tam giác: ");
            triangle.setSide1(Double.parseDouble(scanner.nextLine()));

            System.out.println("Mời bạn nhập vao canh 2 của tam giác: ");
            triangle.setSide2(Double.parseDouble(scanner.nextLine()));

            System.out.println("Mời bạn nhập vao canh 3 của tam giác: ");
            triangle.setSide3(Double.parseDouble(scanner.nextLine()));

            System.out.println("Mời bạn nhập vào màu của tam giác :");
            triangle.setColor(scanner.nextLine());

            if (triangle.getSide1() + triangle.getSide2() > triangle.getSide3() &&
                    triangle.getSide1() + triangle.getSide3() > triangle.getSide2() &&
                    triangle.getSide3() + triangle.getSide2() > triangle.getSide1()) {
                System.out.println("3 cạnh nhập vào hợp lệ :");
                System.out.println("Chu vi của tam giác là :");
                System.out.println(triangle.getPerimeter());
                System.out.println("Diện tích của tam giác là :");
                System.out.println(triangle.getArea());
                System.out.println(triangle);
                break;
            } else {
                System.out.println("3 cạnh nhập vào không hợp lệ!");
            }

        }

    }
}
