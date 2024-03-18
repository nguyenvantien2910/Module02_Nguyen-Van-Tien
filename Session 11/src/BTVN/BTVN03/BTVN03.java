package BTVN.BTVN03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BTVN03 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }

        for (Integer i : listNumber) {
            System.out.println(i);
        }

        System.out.println(listNumber);

        Collections.sort(listNumber);
        System.out.println(listNumber);

        //C1:
        List <Integer> listDESC = new ArrayList<>();
        for (int i = listNumber.size() -1 ; i >= 0 ; i--) {
         listDESC.add(listNumber.get(i));
        }
        System.out.println(listDESC);

        //C2:
        Collections.sort(listNumber, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 02-01;
            }
        });

        //C3:
        Collections.reverse(listNumber);

    }
}
