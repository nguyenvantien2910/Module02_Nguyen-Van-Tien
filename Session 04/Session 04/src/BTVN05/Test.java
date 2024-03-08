package BTVN05;

import java.util.Scanner;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] hs = new Student[100];
        int index = -1;
        int choice;
        do {
            System.out.println("==========Menu==========\n" +
                    "1. Hiển thị danh sách tất cả học sinh\n" +
                    "\n" +
                    "2. Thêm mới học sinh\n" +
                    "\n" +
                    "3. Sửa thông tin học sinh dựa vào mã học sinh\n" +
                    "\n" +
                    "4. Xoá học sinh\n" +
                    "\n" +
                    "5. Thoát\n" +
                    "\n" +
                    "Chọn việc muốn làm: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (index != -1) {
                        for (int i = 0; i <= index; i++) {
                            System.out.println(hs[i].displayData());
                        }
                    } else {
                        System.out.println("Chưa có sinh viên nào");
                    }
                    break;
                case 2:
                    index++;
                    hs[index] = new Student();
                    hs[index].setMaHs("HS" + (index + 1));
                    System.out.println("Nhập tên SV: ");
                    hs[index].setTenHs(scanner.nextLine());
                    System.out.println("Nhập tuổi SV: ");
                    hs[index].setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập giới tính Sv(Nam/Nữ): ");
                    hs[index].setSex(scanner.nextLine());
                    System.out.println("Nhập đại chỉ: ");
                    hs[index].setDiaChi(scanner.nextLine());
                    System.out.println("Nhập số điện thoại: ");
                    hs[index].setPhone(Integer.parseInt(scanner.nextLine()));
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần sửa: ");
                    String update = scanner.nextLine();
                    for (int i = 0; i <= index; i++) {
                        if (update.equals(hs[i].getMaHs())) {
                            System.out.println("Nhập tên mới: ");
                            hs[i].setTenHs(scanner.nextLine());
                            System.out.println("Nhập tuổi mới: ");
                            hs[i].setAge(Integer.parseInt(scanner.nextLine()));
                            System.out.println("Nhập giới tính mới(true/phone): ");
                            hs[i].setSex(scanner.nextLine());
                            System.out.println("Nhập đại chỉ: ");
                            hs[i].setDiaChi(scanner.nextLine());
                            System.out.println("Nhập số điện thoại: ");
                            hs[i].setPhone(Integer.parseInt(scanner.nextLine()));
                            break; // Exit loop once found
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    String delete = scanner.nextLine();
                    for (int i = 0; i <= index; i++) {
                        if (Objects.equals(delete, hs[i].getMaHs())) {
                            // Shifting elements
                            for (int j = i; j < index; j++) {
                                hs[j] = hs[j + 1];
                            }
                            hs[index] = null; // Set last element to null
                            index--;
                            break; // Exit loop once found
                        }
                    }
                    break;
            }
        } while (choice != 5);
    }
}
