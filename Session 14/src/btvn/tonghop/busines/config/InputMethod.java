package btvn.tonghop.busines.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputMethod {
    private static final String ERROR_ALERT = "Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại.";
    private static final String ERROR_DATE = "Định dạng không hợp lệ (dd-MM-yyyy)! Vui lòng thử lại.";
    private static final String EMPTY_ALERT = "Trường nhập vào không thể để trống! Vui lòng thử lại.";

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    //get Input()
    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //Get String method()
    public static String getString() {
        while (true) {
            String result = getInput();
            if (result.equals("")) {
                System.err.println(EMPTY_ALERT);
                continue;
            }
            return result;
        }
    }

    //Get interger
    public static int getInteger() {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    //Get date
    public static Date getDate(){
        while (true) {
            try {
                return sdf.parse(getInput());
            } catch (ParseException errException) {
                System.err.println(ERROR_DATE);
            }
        }
    }

    //Get byte
    public static byte getByte() {
        while (true) {
            try {
                return Byte.parseByte(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }
}
