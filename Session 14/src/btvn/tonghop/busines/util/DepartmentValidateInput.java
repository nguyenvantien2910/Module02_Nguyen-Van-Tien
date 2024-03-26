package btvn.tonghop.busines.util;

import btvn.tonghop.busines.config.InputMethod;
import btvn.tonghop.run.DepartmentManagement;

public class DepartmentValidateInput {
    private static final String DEPARTMENT_ID_INVALID= "ID không hợp lệ, vui lòng thử lại(Bắt đầu bằng chữ D và có 4 kí tự)";
    private static final String PATTERN_ID= "^D\\d{3}$";
    private static final String ID_EXISTS= "ID đã tồn tại, vui lòng thử lại";
    private static final String ID_NOT_EXISTS= "ID không tồn tại, vui lòng thử lại";

    public static String inputDepartmentId() {
        while (true){
            String input = InputMethod.getString();
            if (!input.matches(PATTERN_ID)){
                System.out.println(DEPARTMENT_ID_INVALID);
                continue;
            }
            if (){
                System.out.println(ID_EXISTS);
                continue;
            }
            return input;
        }
    }
}
