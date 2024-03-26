package ra.business.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Config {
    //Regex
    public static final String PATTERN_ID_DEPARTMENT= "^D\\w{3}$";
    public  static final String PATTERN_ID_EMPLOYEE= "^E\\w{4}$";
    public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //get Input()
    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //Get String method()
    public static String getString() {
        while (true) {
            String result = getInput();
            if (result.isEmpty()) {
                System.err.println(Message.EMPTY_ALERT);
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
                System.err.println(Message.ERROR_ALERT);
            }
        }
    }

    //Get date
    public static LocalDate getDate(){
        while (true) {
            try {
                return LocalDate.parse(getInput(), DTF);
            } catch (DateTimeParseException errException) {
                System.err.println(Message.ERROR_DATE);
            }
        }
    }

    //Get byte
    public static byte getByte() {
        while (true) {
            try {
                return Byte.parseByte(getString());
            } catch (NumberFormatException errException) {
                System.err.println(Message.ERROR_ALERT);
            }
        }
    }

}
