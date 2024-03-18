package BTVN.BTVN08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTVN08 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        List<Integer> listNew = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }

        System.out.println(listNumber);

        listNew.addAll(listNumber);
        System.out.println(listNew);
    }
}
