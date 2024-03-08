package BTVN05;

import java.util.Scanner;

public class Student {
    private String maHs;
    private String tenHs;
    private int age;
    private String sex;
    private String diaChi;
    private int phone;

    public Student() {
    }

    ;

    public Student(String maHs, String tenHs, int age, String sex, String diaChi, int phone) {
        this.maHs = maHs;
        this.tenHs = tenHs;
        this.age = age;
        this.sex = sex;
        this.diaChi = diaChi;
        this.phone = phone;
    }

    public String getMaHs() {
        return maHs;
    }

    public String getTenHs() {
        return tenHs;
    }

    public int getAge() {
        return age;
    }

    public String isSex() {
        return sex;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getPhone() {
        return phone;
    }

    public void setMaHs(String maHs) {
        this.maHs = maHs;
    }

    public void setTenHs(String tenHs) {
        this.tenHs = tenHs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã HS: ");
        this.maHs = scanner.nextLine();
        System.out.println("Nhập tên HS: ");
        this.tenHs = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tinh(true/false): ");
        this.sex = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diaChi = scanner.nextLine();
        System.out.println("Nhập sô điện thoại: ");
        this.phone = Integer.parseInt(scanner.nextLine());
    }

    public String displayData() {
        return "Mã HS: " + maHs +
                "\nTên HS: " + tenHs +
                "\nTuổi: " + age +
                "\nGiới tính: " + sex +
                "\nĐịa chỉ: " + diaChi +
                "\nSố điện thoại: " + phone +
                "\n";

    }
}