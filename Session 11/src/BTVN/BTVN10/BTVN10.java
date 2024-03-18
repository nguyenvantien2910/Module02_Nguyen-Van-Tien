package BTVN.BTVN10;

import java.util.ArrayList;
import java.util.List;

public class BTVN10 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        Integer total = 0;
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }

        for (Integer i : listNumber) {
            total += i;
        }

        System.out.println(listNumber);
        System.out.println("Tổng là :" + total);
    }
}
