package ra.presentation;

import ra.business.config.ShopMessage;
import ra.business.implement.DepartmentIplm;
import ra.business.implement.EmployeeIplm;

import java.util.Scanner;

public class Management {
    public static Scanner sc = new Scanner(System.in);
    public static byte choice;
    public static boolean isExit = false;
    public static void main(String[] args) {
        do {
            System.out.println("============MENU==========");
            System.out.println("1. Quản lí phòng ban");
            System.out.println("2. Quản lí nhân viên");
            System.out.println("3. Thoát");
            System.out.println("===========================");

            System.out.println("Vui lòng lựa chọn :");
            choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    departmentManagement();
                    break;

                case 2:
                    employeeManagement();
                    break;

                case 3:
                    isExit = true;
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_NOT_FOUND);
            }
        } while (!isExit);
    }

    private static void employeeManagement() {
        EmployeeIplm employeeIplm = new EmployeeIplm();
        do {
            System.out.println("====================MENU=================");
            System.out.println("1. Hiển thị tất cả nhân viên(phân trang))");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Thay đổi trạng thái nhân viên");
            System.out.println("5. Danh sách nhân viên theo phòng ban");
            System.out.println("6. Sắp sếp nhân viên theo tên tăng dần");
            System.out.println("7. Quay lại");
            System.out.println("=========================================");

            System.out.print("Vui lòng lựa chọn:");
            choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    employeeIplm.displayData();
                    break;
                case 2:
                    employeeIplm.addNew(sc);
                    break;
                case 3:
                    employeeIplm.editInfo(sc);
                    break;
                case 4:
                    employeeIplm.updateStatus(sc);
                    break;
                case 5:
                    employeeIplm.displayEmployeeByDepartment();
                    break;
                case 6:
                    employeeIplm.sortEmployeeByName();
                    break;
                case 7:
                    return;
                default:
                    System.err.println(ShopMessage.SELECT_NOT_FOUND);
            }

        }while (!isExit);
    }

    private static void departmentManagement() {
        DepartmentIplm departmentIplm = new DepartmentIplm();
        do {
            System.out.println("====================MENU=================");
            System.out.println("1. Hiển thị tất cả các phòng ban");
            System.out.println("2. Thêm mới phòng ban");
            System.out.println("3. Sửa thông tin phòng ban");
            System.out.println("4. Thay đổi trạng thái phòng ban");
            System.out.println("5. Tìm kiếm phòng ban theo tên");
            System.out.println("6. Quay lại");
            System.out.println("=========================================");

            System.out.print("Vui lòng lựa chọn:");
            choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    departmentIplm.displayData();
                    break;
                case 2:
                    departmentIplm.addNew(sc);
                    break;
                case 3:
                    departmentIplm.editInfo(sc);
                    break;
                case 4:
                    departmentIplm.updateStatus(sc);
                    break;
                case 5:
                    departmentIplm.findDepartmentByName(sc);
                    break;
                case 6:
                    return;
                default:
                    System.err.println(ShopMessage.SELECT_NOT_FOUND);
            }

        }while (!isExit);
    }
}
