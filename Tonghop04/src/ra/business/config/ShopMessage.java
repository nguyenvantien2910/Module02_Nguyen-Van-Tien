package ra.business.config;

import java.time.format.DateTimeFormatter;

public interface ShopMessage {
    String REGEX_PHONE_VN = "^\\+?(?:0|84)(?:3[2-9]|5[6-9]|7[0|6-9]|8[1-9]|9[0-9])\\d{7}$";
    DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String SELECT_NOT_FOUND = "Lựa chọn không hợp lệ, vui lòng nhập lại !";
    String FIELD_EMTY_ERROR = " Không được để trống !";
    String PHONE_REGEX_ERROR = " Định dạng số điện thoại không hợp lệ !";
    String ID_NOT_FOUND = " ID không hợp lệ !";
    String NAME_NOT_FOUND = " Không tìm thấy tên phù hợp !";
    String DATE_FORMART_ERROR = " Định dạng không đúng, mời nhập lại (dd-MM-yyyy)!";
    String COMMON_ERROR = " Đã có lỗi phát sinh trong quá trình xử lí, mời nhập lại !";
    String EMTY_LIST = "Danh sách trống !";
    String EMPLOYEE_EMTY = "Phòng ban không có nhân viên !";
    String ADD_NEW_SUCESS = "Thêm mới thành công !";
    String EDIT_SUCESS = "Cập nhật thông tin thành công !";
    String UPDATE_STATUS_SUCESS = "Cập nhật trạng thái thành công !";

}
