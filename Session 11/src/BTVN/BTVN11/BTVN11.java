package BTVN.BTVN11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTVN11 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }

        System.out.println(listNumber);

        System.out.println("Số nhỏ nhất là :" + Collections.min(listNumber));
    }
}
