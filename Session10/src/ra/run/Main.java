package ra.run;

import ra.Design.CRUD;
import ra.config.InputMethods;
import ra.entity.Employee;

import java.util.Scanner;

public class Main implements CRUD {
    static Scanner scanner = new Scanner(System.in);

    static Employee[] employees = new Employee[100];
    static byte countEmployee = 0;

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("*********************MENU**********************");
            System.out.println("1.Thêm mới 1 nhân viên ");
            System.out.println("2.Hiển thị danh sách thông tin nhân viên");
            System.out.println("3.Xem thông tin nhân viên theo mã nhân viên");
            System.out.println("4.Cập nhật thông tin nhân viên");
            System.out.println("5.Xóa nhân viên");
            System.out.println("6.Tìm kiếm nhân viên theo tên (tương đối)");
            System.out.println("7.Sắp xếp và hiển thị danh sách nhân viên theo tên từ a - z");
            System.out.println("8.Thoát");

            System.out.println(InputMethods.INPUT_MESSAGE);
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    create();
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    showEmployeeInfoById();
                    break;

                case 4:
                    edit();
                    break;

                case 5:
                    delete();
                    break;

                case 6:
                    searchEmployeeByName();
                    break;

                case 7:
                    sortEmployeeAndDisplay();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println(InputMethods.INPUT_NOT_FOUND_MESSAGE);
            }
        }
    }

    private static void sortEmployeeAndDisplay() {
        if (countEmployee != 0) {
            for (int i = 0; i < countEmployee - 1; i++) {
                for (int j = i + 1; j < countEmployee; j++) {
                    if (employees[i].getEmployeeName().compareTo(employees[j].getEmployeeName()) > 0) {
                        Employee temp = employees[j];
                        employees[j] = employees[i];
                        employees[i] = temp;
                    }
                }
            }
            System.out.println("------DANH SACH SAU KHI SORT-------");
            for (int i = 0; i < countEmployee; i++) {
                employees[i].displayData();
            }
        } else {
            System.out.println(InputMethods.COUNT_ZERO_MESSAGE);
        }
    }

    private static void searchEmployeeByName() {
        if (countEmployee != 0 ) {
            System.out.println("Mời bạn nhập tên của nhân viên muốn tìm kiếm :");
            String searchByName = scanner.nextLine();
            boolean isExit = false;

            for (int i = 0; i < countEmployee; i++) {
                if (employees[i].getEmployeeName().contains(searchByName)) {
                    employees[i].displayData();
                    isExit = true;
                }
            }

            if (!isExit) {
                System.out.println(InputMethods.ID_NOT_FOUND);
            }
        } else {
            System.out.println(InputMethods.COUNT_ZERO_MESSAGE);
        }
    }

    private static void showEmployeeInfoById() {
        if (countEmployee != 0) {
            System.out.println("Mời bạn nhập ID của nhân viên muốn tìm kiếm :");
            String searchKey = scanner.nextLine();
            boolean isExit = false;

            for (int i = 0; i < countEmployee; i++) {
                if (searchKey.equals(employees[i].getEmployeeID())) {
                    employees[i].displayData();
                    isExit = true;
                    break;
                }
            }

            if (!isExit) {
                System.out.println(InputMethods.ID_NOT_FOUND);
            }
        } else {
            System.out.println(InputMethods.COUNT_ZERO_MESSAGE);
        }
    }

    @Override
    public void create() {
        Employee newEmployee = new Employee();
        newEmployee.inputData();
        newEmployee.generateID();
        employees[countEmployee++] = newEmployee;
        System.out.println(InputMethods.ADD_SUCESS_MESSAGE);
    }

    @Override
    public void display() {
        if (countEmployee > 0) {
            for (int i = 0; i < countEmployee; i++) {
                employees[i].displayData();
            }
        } else {
            System.out.println(InputMethods.COUNT_ZERO_MESSAGE);
        }
    }

    @Override
    public void edit() {
        if (countEmployee != 0) {
            System.out.println("Mời bạn nhập ID của nhân viên muốn thay đổi thông tin :");
            String editId = scanner.nextLine();
            boolean isExit = false;

            for (int i = 0; i < countEmployee; i++) {
                if (editId.equals(employees[i].getEmployeeID())) {
                    employees[i].inputData();
                    isExit = true;
                    System.out.println(InputMethods.EDIT_SUCESS_MESSAGE);
                    break;
                }
            }
            if (!isExit) {
                System.out.println(InputMethods.ID_NOT_FOUND);
            }
        } else {
            System.out.println(InputMethods.COUNT_ZERO_MESSAGE);
        }
    }

    @Override
    public void delete() {
        if (countEmployee != 0) {
            System.out.println("Mời bạn nhập ID của nhân viên muốn xóa :");
            String deleteId = scanner.nextLine();
            boolean isExit = false;

            for (int i = 0; i < countEmployee; i++) {
                if (deleteId.equals(employees[i].getEmployeeID())) {
                    for (int j = i; j < countEmployee - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    employees[countEmployee - 1] = null;
                    countEmployee--;
                    isExit = true;
                    System.out.println(InputMethods.DELETE_SUCESS_MESSAGE);
                    break;
                }
            }
            if (!isExit) {
                System.out.println(InputMethods.ID_NOT_FOUND);
            }
        } else {
            System.out.println(InputMethods.COUNT_ZERO_MESSAGE);
        }
    }
}
