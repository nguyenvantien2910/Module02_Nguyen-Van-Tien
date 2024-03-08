package BTVN06;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    ;

    public Employee(String employeeId, String employeeName, int age, boolean gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextLine();
        System.out.println("Nhập tên nhận viên: ");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tinh(true/false): ");
        this.gen = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập hệ số lương: ");
        this.rate = Double.parseDouble(scanner.nextLine());
    }

    public String displayData() {
        return "Mã nhân viên: " + employeeId +
                "\nTên nhân viên: " + employeeName +
                "\nTuổi: " + age +
                "\nGiới tính: " + (gen ? "Nam" : "Nữ") +
                "\nHệ số lương: " + rate +
                "\nLương: " + salary;

    }

    public void calSalary() {
        this.salary = rate * 1300000;
    }
}
