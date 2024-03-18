package ra.config;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class InputMethods {
    public static final String ERROR_ALERT = "Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại";
    public static final String ERROR_DATE = "Định dạng không hợp lệ (dd/MM/yyyy)! Vui lòng thử lại";
    public static final String EMPTY_ALERT = "Trường nhập vào không thể để trống! Vui lòng thử lại";
    public static final String ADD_SUCESS_MESSAGE = "Thêm mới thành công !";
    public static final String EDIT_SUCESS_MESSAGE = "Chỉnh sửa thành công !";
    public static final String DELETE_SUCESS_MESSAGE = "Xóa thành công !";
    public static final String INPUT_MESSAGE = "Xin mời nhập giá trị lựa chọn :";
    public static final String INPUT_NOT_FOUND_MESSAGE = "Giá trị nhập không đúng, mời nhập lại !";
    public static final String ID_NOT_FOUND = "ID đã nhập không tồn tại, mời nhập lại !";
    public static final String LENGTH_FAIL_MESSAGE = "Độ dài kí tự không hợp lệ (6 ~ 30 kí tự) !";
    public static final String INPUT_NAME_MESSAGE = "Mời bạn nhập tên cho nhân viên :";
    public static final String INPUT_DOB_MESSAGE = "Mời bạn nhập ngày tháng năm sinh :";
    public static final String INPUT_RATE_MESSAGE = "Mời bạn nhập hệ số năng suất :";
    public static final String INPUT_PHONE_MESSAGE = "Mời bạn nhập số điện thoại :";
    public static final String INPUT_ADDRESS_MESSAGE = "Mời bạn nhập địa chỉ :";
    public static final String COUNT_ZERO_MESSAGE = "Hiện tại không có nhân viên.";
    /*========================================Input Method Start========================================*/

    /**
     * getString()  Return a String value from the user.
     */
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

    /**
     * getInteger()  Return a Integer value from the user.
     */
    public static int getInteger() {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /*========================================Input Method End========================================*/

    /**
     * getInput()  Return any String value from the user.
     */
    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Nhap ngay thang : dd/MM/yyyy
     */
    public static Date getDate() {

        while (true) {
            try {
                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                return sf.parse(getInput());
            } catch (ParseException errException) {
                System.err.println(ERROR_DATE);
            }
        }
    }
}
