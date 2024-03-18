package ra.entity;

import ra.config.InputMethods;

import java.util.Date;

public class Employee {

    private String employeeID, employeeName, address;
    private Date dob;
    private Integer phoneNumber, salary, rate;

    final int DEFAULT_SALARY = 1500000;

    public Employee() {
    }

    public Employee(String employeeName, String address, Date dob, Integer phoneNumber, Integer rate) {
        this.employeeName = employeeName;
        this.address = address;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.rate = rate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public void displayData() {
        System.out.println("---------Thông tin của nhân viên--------");
        System.out.println("ID : " + employeeID);
        System.out.println("Tên : " + employeeName);
        System.out.println("Ngày sinh : " + dob);
        System.out.println("Địa chỉ : " + address);
        System.out.println("Lương cơ bản : " + salary + "VND");
        System.out.println("Hệ số năng suất : " + rate);
    }

    // Auto-generate ID
    public static int counter = 0;

    public String generateID() {
        counter++;
        return this.employeeID = "NV" + counter;
    }

    public void inputData() {
        // Name
        while (true) {
            System.out.println(InputMethods.INPUT_NAME_MESSAGE);
            this.employeeName = InputMethods.getString();

            if (employeeName.length() < 6 || employeeName.length() > 30) {
                System.out.println(InputMethods.LENGTH_FAIL_MESSAGE);
            } else {
                break;
            }
        }

        // DOB
        while (true) {
            System.out.println(InputMethods.INPUT_DOB_MESSAGE);
            this.dob = InputMethods.getDate();
            break;
        }

        // Phone
        while (true) {
            System.out.println(InputMethods.INPUT_PHONE_MESSAGE);
            this.phoneNumber = InputMethods.getInteger();
            break;
        }

        // Address
        while (true) {
            System.out.println(InputMethods.INPUT_ADDRESS_MESSAGE);
            this.address = InputMethods.getString();
            break;
        }

        // Rate
        while (true) {
            System.out.println(InputMethods.INPUT_RATE_MESSAGE);
            this.rate = InputMethods.getInteger();
            break;
        }

        // Salary
        this.salary = this.rate * DEFAULT_SALARY;
    }
}
