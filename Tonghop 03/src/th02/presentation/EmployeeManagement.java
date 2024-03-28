package th02.presentation;

import th02.businessImp.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        public Employee[] employees = new Employee[100];
        public int indexEmployee = 0;
    }

    boolean isExit = false;
    byte choice;
        do

    {
        System.out.println("********************MENU*********************");
        System.out.println("1. Nhập thông tin cho n nhân viên");
        System.out.println("2. Hiển thị thông tin nhân viên ");
        System.out.println("3. Tính lương cho các nhân viên ");
        System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
        System.out.println("5. Cập nhật thông tin nhân viên ");
        System.out.println("6. Xóa nhân viên theo mã nhân viên ");
        System.out.println("7. Sắp xếp nhân viên theo lương tăng dần (Comparable) ");
        System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator) ");
        System.out.println("9. Sắp xếp nhân vên theo năm sinh tăng dần (Comparator) ");
        System.out.println("10. Thoát");

        System.out.print("Lựa chọn của bạn là : ");

        choice = Byte.parseByte(scanner.nextLine());

        switch (choice) {
            case 1:
                addNewEmployee(scanner, employees, indexEmployee);
                break;
            case 2:
                displayAllEmployee(employees, indexEmployee);
                break;
            case 3:
                calEmployeeSalary(employees, indexEmployee);
                break;
            case 4:
                findEmployeeByName(scanner, employees, indexEmployee);
                break;
            case 5:
                updateEmployeeInfo(scanner, employees, indexEmployee);
                break;
            case 6:
                deleteEmployeeById(scanner, employees, indexEmployee);
                break;
            case 7:
                sortEmployeeByName(employees, indexEmployee);
                break;
            case 8:
                sortEmployeeBySalary(employees, indexEmployee);
                break;
            case 9:
                sortEmployeeByYear(employees, indexEmployee);
                break;
            case 10:
                isExit = true;
                break;
            default:
                System.err.println("Lựa chọn không hợp lên, mời nhập lại (1~10)");
        }

    } while(!isExit);
}

private static void sortEmployeeByYear(Employee[] employees, int indexEmployee) {
}

private static void sortEmployeeBySalary(Employee[] employees, int indexEmployee) {
}

private static void sortEmployeeByName(Employee[] employees, int indexEmployee) {
    Arrays.sort(employees, (o1, o2) -> String.compare(o1.getName(), o2.getName()));
    System.out.println("Danh sách sắp xếp theo lợi nhuận giảm dần ");
    for (int i = 0; i < indexEmployee; i++) {
        employees[i].displayData();
    }

    private static void deleteEmployeeById (Scanner scanner, Employee[]employees,int indexEmployee){
        if (indexEmployee != 0) {
            System.out.println("Nhập mã nhân viên muốn xóa : ");
            String deleteId = scanner.nextLine();
            int index = -1;

            for (int i = 0; i < indexEmployee; i++) {
                if (employees[i].getId().equals(deleteId)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = index; i < indexEmployee - 1; i++) {
                    employees[i] = employees[i + 1];
                }
                employees[indexEmployee - 1] = null;
                indexEmployee--;
            } else {
                System.out.println("Nhân viên không tồn tại");
            }

        } else {
            System.err.println("Danh sách nhân viên trống !");
        }
    }

    private static void updateEmployeeInfo (Scanner scanner, Employee[]employees,int indexEmployee){
        if (indexEmployee != 0) {
            while (true) {
                boolean isExists = false;
                System.out.println("Nhập mã nhân viên muốn thay đổi thông tin : ");
                String searchEmployeeID = scanner.nextLine();

                for (int i = 0; i < indexEmployee; i++) {
                    if (employees[i].getId().equals(searchEmployeeID)) {
                        employees[i].inputData(scanner, false);
                        isExists = true;
                        break;
                    }
                }

                if (!isExists) {
                    System.err.println("Không tìm thấy mã nhân viên phù hợp, mời nhập lại !");
                }
            }
        } else {
            System.err.println("Danh sách nhân viên trống !");
        }
    }

    private static void findEmployeeByName (Scanner scanner, Employee[]employees,int indexEmployee){
        if (indexEmployee != 0) {
            System.out.println("Nhận tên nhân viên muốn tìm kiếm : ");
            String searchName = scanner.nextLine();

            boolean isExits = true;

            for (int i = 0; i < indexEmployee; i++) {
                if (employees[i].getName().contains(searchName)) {
                    employees[i].displayData();
                    isExits = false;
                }
            }
            if (!isExits) {
                System.err.println("Không có kết quả nào phù hợp !");
            }
        } else {
            System.err.println("Danh sách nhân viên trống !");
        }
    }

    private static void calEmployeeSalary (Employee[]employees,int indexEmployee){
        if (indexEmployee != 0) {
            for (int i = 0; i < indexEmployee; i++) {
                employees[i].calSalary();
            }
        } else {
            System.err.println("Danh sách nhân viên trống !");
        }
    }

    private static void displayAllEmployee (Employee[]employees,int indexEmployee){
        if (indexEmployee != 0) {
            System.out.println("HIÊN THỊ THÔNG TIN TẤT CẢ NHÂN VIÊN");
            for (int i = 0; i < indexEmployee; i++) {
                employees[i].displayData();
            }
        } else {
            System.err.println("Danh sách nhân viên trống!");
        }
    }

    private static void addNewEmployee (Scanner scanner, Employee[]employees,int indexEmployee){
        System.out.println("Nhập số lượng nhân viên muốn thêm: ");
        byte addNum = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < addNum; i++) {
            Employee employee = new Employee();
            System.out.printf("Nhập thông tin cho nhân viên thứ %d", i + 1);

            employees[indexEmployee] = employee;
            employee.inputData(scanner, true);
            indexEmployee++;
        }

        System.out.println("Thêm mới nhân viên thành công!");
    }

}
