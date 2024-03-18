package BTVN.BTVN04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTVN04 {
    public static void main(String[] args) {
        final String string = "Rekkei Academy để nông dân biết code";
        List <String> listString = new ArrayList<>();

        String[] newstring = string.split("\\s");
        //C1
        //for (int i = 0; i < newstring.length; i++) {
        //    listString.add(newstring[i]);
        //}

        //C2:
        Collections.addAll(listString,newstring);

        System.out.println(listString);

        System.out.println("Các phần tử có kí tự > 3 :");
        for (String s : listString) {
            if (s.length() > 3) {
                System.out.println(s);
            }
        }
    }
}
