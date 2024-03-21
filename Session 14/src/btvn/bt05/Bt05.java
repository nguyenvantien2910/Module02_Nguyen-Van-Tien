package btvn.bt05;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bt05 {
    public static void main(String[] args) {
        //Tạo 1 list số ngẫu nhiên
        List<Integer> random = Stream.generate(() -> new Random().nextInt(100))
                .limit(20)
                .sorted()
                .collect(Collectors.toList());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số muốn kiểm tra: ");
        int checkNum = Integer.parseInt(scanner.nextLine());

        //In ra dãy số đã gen randon
        System.out.println(random);

        //In ra các số lớn hơn giá trị đã nhập
        System.out.printf("Danh sách các số lớn hơn %d là :\n",checkNum);
        random.stream().filter(n -> n > checkNum).forEach(System.out::println);
    }
}
