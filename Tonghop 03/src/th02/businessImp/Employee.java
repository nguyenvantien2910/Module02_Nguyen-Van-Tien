package th02.businessImp;

import th02.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private String Id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, boolean status) {
        this.Id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.status = status;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void calSalary() {
        this.salary = this.rate * IEmployee.BASIC_SALARY + commission;
    }

    @Override
    public void inputData(Scanner scanner, boolean isAdd) {
        if (isAdd) {
            System.out.println("Nhập mã nhân viên : ");
            this.Id = scanner.nextLine();
        }

        System.out.println("Nhập tên nhân viên : ");
        this.name = scanner.nextLine();

        System.out.println("Nhập năm sinh nhân viên : ");
        this.year = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập hệ số lương nhân viên : ");
        this.rate = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập hoa hồng của nhân viên hàng tháng : ");
        this.commission = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập trạng thái của nhân viên (true/false)");
        this.status = Boolean.parseBoolean(scanner.nextLine());

    }

    @Override
    public void displayData() {
        System.out.printf("| ID : %-5s | Name: %-15s | Year: %-4d\n", Id, name, year);
        System.out.printf("| Rate : %-5.2f | Commission: %-15.2f | Salary: %-15.2f\n", rate, commission, salary);
        System.out.printf("| Status : %-10s | \n", status ? "Đang làm việc" : "Nghỉ việc");
    }
}
