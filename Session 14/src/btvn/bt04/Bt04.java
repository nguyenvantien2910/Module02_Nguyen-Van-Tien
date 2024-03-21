package btvn.bt04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bt04 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Đạo");
        strings.add("Liêm");
        strings.add("Tự");
        strings.add("Hùng");
        strings.add("Thắng");

        strings.stream().sorted(Comparator.naturalOrder()).toList().forEach(System.out::println);
    }
}
