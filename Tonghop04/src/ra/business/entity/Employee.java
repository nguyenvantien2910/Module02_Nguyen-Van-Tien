package ra.business.entity;

import ra.business.config.ShopMessage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private int id;
    private String fullName;

    private String address;

    private String phone;

    private LocalDate dateOfBirth;

    private Department department;

    private boolean status;

    public Employee() {
        this.status = true;
    }

    public Employee(String fullName, String address, String phone, LocalDate dateOfBirth, Department department, boolean status) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.status = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void displayData() {
        System.out.printf("| ID: %-5d | Name: %-15s | Phone: %-12s | Address: %-15s | DOB: %-12s | Department: %-15s | Status: %-10s\n",
                this.id, this.fullName, this.phone, this.address, this.dateOfBirth.toString(), this.department.getName(), this.status ? "Đang làm" : "Đã nghỉ");
    }

    public void inputData(Scanner sc, List<Employee> listEmployee, List<Department> listDepartment, boolean isAdd) {
        if (isAdd) {
            this.id = findIdMax(listEmployee);
        }
        this.fullName = inputFullName(sc);
        this.address = inputAdress(sc);
        this.phone = inputPhone(sc);
        this.dateOfBirth = inputDateOfBirth(sc);
        this.department = inputDepartment(listDepartment, sc);
        this.status = true;
    }

    private Department inputDepartment(List<Department> listDepartment, Scanner sc) {
        if (listDepartment.isEmpty()) {
            return null;
        } else {
            System.out.println("Chọn phòng ban : ");
            for (int i = 0; i < listDepartment.size(); i++) {
                if (listDepartment.get(i).isStatus()) {
                    System.out.printf("%d. %s\n", i + 1, listDepartment.get(i).getName());
                }
            }
            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = Byte.parseByte(sc.nextLine());
            listDepartment.get(choice - 1).setNumberEmployee(listDepartment.get(choice - 1).getNumberEmployee() + 1);
            return listDepartment.get(choice - 1);
        }
    }

    private LocalDate inputDateOfBirth(Scanner sc) {
        do {
            System.out.println("Mời nhập ngày tháng năm sinh (dd-MM-yyy):");
            String inputDate = sc.nextLine();
            try {
                LocalDate dateOfBirth = LocalDate.parse(inputDate, ShopMessage.DTF);
                return dateOfBirth;
            } catch (Exception ex) {
                System.err.println(ShopMessage.COMMON_ERROR);
            }

        } while (true);
    }

    private String inputPhone(Scanner sc) {
        do {
            System.out.println("Mời bạn nhập số điện thoại : ");
            String inputPhoneNum = sc.nextLine();
            if (inputPhoneNum.matches(ShopMessage.REGEX_PHONE_VN)) {
                return inputPhoneNum;
            } else {
                System.err.println(ShopMessage.PHONE_REGEX_ERROR);
            }
        } while (true);
    }

    private String inputAdress(Scanner sc) {
        do {
            System.out.println("Mời bạn nhập địa chỉ:");
            String inputAddress = sc.nextLine();
            if (inputAddress.isBlank()) {
                System.err.println(ShopMessage.FIELD_EMTY_ERROR);
            } else {
                return inputAddress;
            }

        } while (true);
    }

    private String inputFullName(Scanner sc) {
        do {
            System.out.println("Mời nhập tên nhân viên :");
            String inputName = sc.nextLine();
            if (inputName.trim().isBlank()) {
                System.err.println(ShopMessage.FIELD_EMTY_ERROR);
            } else {
                return inputName;
            }
        } while (true);

    }

    private int findIdMax(List<Employee> listEmployee) {
        int maxId = 0;
        for (Employee employee : listEmployee) {
            if (employee.getId() > maxId) {
                maxId = employee.getId();
            }
        }
        return maxId + 1;
    }
}
