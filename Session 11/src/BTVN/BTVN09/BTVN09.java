package BTVN.BTVN09;

import java.util.ArrayList;
import java.util.Collections;

public class BTVN09 {
    public static void main(String[] args) {
        Integer[] listNumber = {1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8 , 9, 9 , 11, 15, 17, 17};
        ArrayList<Integer> tempList = new ArrayList<>();

        for (Integer num : listNumber) {
            if (!tempList.contains(num)) {
                tempList.add(num);
            }
        }

        for (Integer i : tempList) {
            System.out.println(i);
        }
    }
}
