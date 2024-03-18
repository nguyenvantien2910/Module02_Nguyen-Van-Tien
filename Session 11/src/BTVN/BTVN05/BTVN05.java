package BTVN.BTVN05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTVN05 {
    public static void main(String[] args) {
        final String string = "Rekkei Academy để nông dân biết code";
        List<String> listString = new ArrayList<>();

        String[] newstring = string.split("\\s");
        //C1
        //for (int i = 0; i < newstring.length; i++) {
        //    listString.add(newstring[i]);
        //}

        //C2:
        Collections.addAll(listString,newstring);

        System.out.println(listString);

        //C1
        //Collections.sort(listString);
        //System.out.println(listString);

        //C2:
        int minLength = Integer.MAX_VALUE;

        for (String s : listString) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }

        System.out.println("Minimum length: " + minLength);

        for (String s : listString) {
            if (s.length() == minLength) {
                System.out.println(s);
            }
        }

        //C3:
    }
}
