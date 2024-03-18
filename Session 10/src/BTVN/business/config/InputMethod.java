package BTVN.business.config;

import java.util.Scanner;

public class InputMethod {
    //getInput()

    String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //getString()
    String getString() {
    while (true) {
        String result = getInput();
        if (result.equals("")) {
            System.out.println(CONSTANT.EMPTY_ALERT);
            continue;
        }
        return result;
    }
    }


}
