package btvn.bt010203;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bt {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(() -> new Random().nextInt(1000))
                .limit(100)
                .sorted()
                .collect(Collectors.toList());

        // In ra list random đã tạo
        System.out.println(random);

        //Tìm giá trị lớn nhất trong list đã tạo
        Integer max = random.stream().max(Integer::compareTo).orElse(null);
        //In giá trị lớn nhất tìm được
        System.out.println("Max là :" + max);

        //Lọc và in ra các số chẵn
        System.out.println("Các số chẵn là :");
        random.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //Tính tổng :
        System.out.println("Tổng là : " + random.stream().reduce(0, Integer::sum));

        //Kiểm tra danh sách có chứa ít nhất 1 số chẵn
        System.out.println();
        if (random.stream().anyMatch(n -> n % 2 == 0)) {
            System.out.println("Danh sách có chứa ít nhất 1 số chẵn");
            System.out.println(random.stream().filter(n -> n % 2 == 0)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Danh sách không chứa 1 số chẵn nào")));
        }
    }
}
