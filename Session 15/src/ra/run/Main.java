package ra.run;

import ra.business.config.Config;

import java.util.Scanner;

public class Main {
    static EmployeeManagement employeeManagement = new EmployeeManagement();
    static DepartmentManagement departmentManagement = new DepartmentManagement();
    public static void main(String[] args) {
        while (true) {
            System.out.println("--------------MENU-----------");
            System.out.println("1. Quản lí phòng ban");
            System.out.println("2. Quản lí nhân viên");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn nhập lựa chọn :");

            byte select = Config.getByte();

            switch (select) {
                case 1:
                    departmentManagement.displayMenu();
                    break;

                case 2:
                    employeeManagement.displayMenu();
                    break;

                case 3:
                    return;

            }
        }
    }

}
