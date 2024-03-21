package btvn.bt06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bt06 {
    public static void main(String[] args) {
        //Tạo danh sách chuỗi
        List<String> strings = new ArrayList<>();

        strings.add("tự");
        strings.add("hùng");
        strings.add("liêm");
        strings.add("thắng");
        strings.add("giang");
        strings.add("hiếu");

        //in danh sách chuối trước khi chuyển thành in hoa
        strings.forEach(System.out::println);

        //chuyển chuổi trên thành in hoa và in ra
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
