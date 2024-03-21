package btvn.bt07;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bt07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập vào 2 số đầu suối của khoảng
        System.out.println("Xin mời nhập số bắt đầu của khoảng : ");
        int startNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Xin mời nhập số kết thúc của khoảng : ");
        int endNum = Integer.parseInt(scanner.nextLine());

        List<Integer> numberList = IntStream.range(startNum,endNum).boxed().toList();

        System.out.println("Danh sách khoảng số nguyên là : ");
        numberList.forEach(System.out::println);

    }
}
