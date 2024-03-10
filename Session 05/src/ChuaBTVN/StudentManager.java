package ChuaBTVN;

import java.util.Scanner;

public class StudentManager {
    private static Student[] students = new Student[100];
    private static int length = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager.showAllStudent();
        int choice;

        do {
            System.out.println("1.\tHiển thị danh sách sinh viên\n" +
                    "2.\tThêm mới n sinh viên\n" +
                    "3.\tUpdate thông tin sinh viên theo id\n" +
                    "4.\tXoá sinh viên theo id\n" +
                    "5.\tSắp xếp sinh viên theo id giảm dần\n" +
                    "6.\tTìm kiếm sinh viên theo số tuổi nhập vào\n" +
                    "7.\tThoát\n");
            System.out.println("Moi lua chon :");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAllStudent();
                    break;
                case 2:
                    createStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudenByID(scanner);
                    break;
                case 5:
                    sortById();
                    break;
                case 6:
                    searchByAge(scanner);
                    break;
            }
        } while (choice != 7);
    }

    public static void showAllStudent() {

        for (int j = 0; j < length; j++) {
            students[j].displayData();
            System.out.println("--------------------------");
        }

    }

    public static void createStudent(Scanner scanner) {
        System.out.println("Nhập số sinh viên muốn nhập:  ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.inputData(scanner);
            students[length] = student;
            length++;
        }
    }

    public static void updateStudent(Scanner scanner) {
        System.out.println("Mời bạn nhập ID sinh viên muốn cập nhật: ");
        int updateId = Integer.parseInt(scanner.nextLine());
        boolean existing = false;

        for (int i = 0; i < length; i++) {

            if (updateId == students[i].getId()) {
                System.out.println("nhập vào tên sinh viên: ");
                students[i].setName(scanner.nextLine());
                System.out.println("nhập vào giới tính sinh viên (Male/Female): ");
                students[i].setGender(scanner.nextLine());
                System.out.println("nhập vào tuổi của sinh viên: ");
                students[i].setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("nhập vào địa chỉ sinh viên: ");
                students[i].setAddress(scanner.nextLine());
                System.out.println("nhập vào số điện thoại sinh viên: ");
                students[i].setPhonenumber(scanner.nextLine());

                existing = true;
            }
        }

        if (!existing) {
            System.out.println("Mã số sinh viên không hợp lệ");
        }
    }

    public static void deleteStudenByID(Scanner scanner) {
        int number;
        boolean existing = false;
        System.out.println("Mời bạn nhập ID sinh viên muốn xóa: ");
        number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length; i++) {
            if (students[i].getId() == number) {
                for (int j = i; j < length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[length - 1] = null;
                length--;
                existing = true;
                break;
            }
        }

        if (!existing) {
            System.out.println("Ma sinh vien khong hop le!\n");
        }
    }

    public static void sortById() {
        Student tem;
        for (int i = 0; i < length -1 ; i++) {
            for (int j = 1; j < length; j++) {
                if (students[i].getId() < students[j].getId()) {
                    tem = students[j];
                    students[j] = students[i];
                    students[i] = tem;
                }
            }
        }

        showAllStudent();
    }

    public static void searchByAge(Scanner scanner) {
        int number;
        boolean existing = false;
        System.out.println("Mời bạn nhập số tuổi của sinh viên muốn tìm kiếm : ");
        number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length; i++) {
            if (students[i].getAge() == number) {
                existing = true;
                students[i].displayData();
            }
        }

        if (!existing) {
            System.out.println("Không tìm thấy sinh viên hợp lệ\n");
        }
    }
}


