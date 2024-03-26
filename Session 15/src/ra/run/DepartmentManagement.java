package ra.run;

import ra.business.config.Config;
import ra.business.config.Message;

import java.util.Scanner;

public class DepartmentManagement {
    public void displayMenu() {
        byte select;
        //In menu
        while (true) {
            System.out.println("-------------Quản trị phòng ban-----------");
            System.out.println("1.Hiển thị danh sách phòng ban");
            System.out.println("2.Thêm mới phòng ban");
            System.out.println("3.Chỉnh sửa tên phòng ban");
            System.out.println("4.Hiển thị danh sách nhân viên của phòng ban theo mã phòng");
            System.out.println("5.Xóa phòng ban (Chỉ xóa khi không có nhân viên nào)");
            System.out.println("6.Trở lại");

            System.out.println("Mời bạn nhập lựa chọn : ");
            select = Config.getByte();

            switch (select) {
                case 6:
                    return;
                default:
                    System.out.println(Message.SELECT_NOT_FOUND);
            }
        }
    }
}
