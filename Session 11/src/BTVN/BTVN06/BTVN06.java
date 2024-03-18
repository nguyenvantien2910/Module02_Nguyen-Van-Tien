package BTVN.BTVN06;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class BTVN06 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }

        for (Integer i : listNumber) {
            System.out.println(i);
        }

        //C1:
        for (int i = 0; i < listNumber.size() - 1; i++) {
            for (int j = i + 1; j < listNumber.size(); j++) {
                if (listNumber.get(i) > listNumber.get(j)) {
                    int temp = listNumber.get(i);
                    listNumber.set(i, listNumber.get(j));
                    listNumber.set(j, temp);
                }
            }
        }

        System.out.println("Sorted list (DESC): " + listNumber);

        //C2:
        Collections.sort(listNumber, Collections.reverseOrder());
        System.out.println("Sorted list (DESC): " + listNumber);
    }
}
