package BTVN.BTVN07;

import java.util.ArrayList;
import java.util.List;

public class BTVN07 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        List<Integer> listDivi2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }

        for (Integer i : listNumber) {
            System.out.println(i);
        }

        for (Integer i : listNumber) {
            if (i % 2 == 0) {
                listDivi2.add(i);
            }
        }

        System.out.println(listDivi2);


    }
}
