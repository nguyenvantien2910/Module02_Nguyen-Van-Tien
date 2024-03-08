package ChuaBTVN;

import java.util.Scanner;

public class Employee {
    private String employeeId, employeeName, gen;
    private Integer age, rate, salary;

    // Constructor
    public Employee() {
        this.salary = 0;
    }

    public Employee(String employeeId, String employeeName, String gen, Integer age, Integer rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gen = gen;
        this.age = age;
        this.rate = rate;
        this.salary = 0;
    }


    // Getter

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getGen() {
        return gen;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getRate() {
        return rate;
    }

    public Integer getSalary() {
        return salary;
    }

    //Setter


    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    // inputData()
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma nhan vien: ");
        this.employeeId = scanner.nextLine();

        System.out.println("Moi ban nhap ten nhan vien: ");
        this.employeeName = scanner.nextLine();

        System.out.println("Moi ban nhap tuoi cua nhan vien: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.println("Moi ban nhap gioi tinh cua nhan vien: ");
        this.gen = scanner.nextLine();

        System.out.println("Moi ban nhap he so luong nhan vien: ");
        this.rate = Integer.parseInt(scanner.nextLine());
    }

    //displayData()
    public String displayData() {
        return "Ma nhan vien : " + employeeId +
                "\n Ten nhan vien :" + employeeName +
                "\n Tuoi cua nhan vien :" + age +
                "\n Gioi tinh cua nhan vien :" + gen +
                "\n He so luong cua nhan vien :" + rate +
                "\n Luong cua nhan vien :" + salary;
    }

    //calSalary()

    public Integer calSalary() {
        this.salary = this.rate * 1300000;
        return salary;
    }
}
