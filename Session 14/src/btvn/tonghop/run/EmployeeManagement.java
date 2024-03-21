package btvn.tonghop.run;

import btvn.tonghop.busines.config.Message;

import java.util.Scanner;

public class EmployeeManagement {
    static Scanner scanner = new Scanner(System.in);
    static int select;
    public static void main(String[] args) {
        //In menu
        while (true) {
            System.out.println("--------------Quản trị nhân viên-----------");
            System.out.println("1.Hiển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)");
            System.out.println("2.Xem chi tiết thông tin nhân viên theo mã nhân viên (toàn bộ thông tin)");
            System.out.println("3.Thêm mới nhân viên");
            System.out.println("4.Chỉnh sửa thông tin nhân viên");
            System.out.println("5.Xóa nhân viên");
            System.out.println("6.Thống kê số lượng nhân viên trung bình của mỗi phòng ");
            System.out.println("7.Tìm ra 5 phòng có số lượng nhân viên đông nhất ");
            System.out.println("8.Tìm ra người quản lý nhiều  nhân viên nhất ");
            System.out.println("9.Tìm ra 5 nhân viên có tuổi cao nhất công ty ");
            System.out.println("9.Tìm ra 5 nhân viên có tuổi cao nhất công ty ");
            System.out.println("9.Tìm ra 5 nhân viên hưởng lương cao nhất ");
            System.out.println("10.Trở lại ");

            System.out.println("Mời bạn nhập lựa chọn : ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 10:
                    return;
                default:
                    System.out.println(Message.SELECT_NOT_FOUND);
            }
        }
    }
}
