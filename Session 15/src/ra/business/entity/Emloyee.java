package ra.business.entity;

import ra.business.config.Config;
import ra.business.config.Message;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Emloyee {
    private String EmloyeeId,EmloyeeName;
    private LocalDate birthday;
    private boolean sex;
    private double salary;
    private Emloyee manager;
    private Department department;

    public Emloyee() {
    }

    public Emloyee(String EmloyeeId, String EmloyeeName, LocalDate birthday, boolean sex, double salary, Emloyee manager, Department department) {
        this.EmloyeeId = EmloyeeId;
        this.EmloyeeName = EmloyeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public String getEmloyeeId() {
        return EmloyeeId;
    }

    public void setEmloyeeId(String EmloyeeId) {
        this.EmloyeeId = EmloyeeId;
    }

    public String getEmloyeeName() {
        return EmloyeeName;
    }

    public void setEmloyeeName(String EmloyeeName) {
        this.EmloyeeName = EmloyeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emloyee getManager() {
        return manager;
    }

    public void setManager(Emloyee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void inputData(List<Emloyee> EmloyeeList, List<Department> departmentList){
        this.EmloyeeId = getInputEmloyeeId(EmloyeeList);
        this.EmloyeeName = getInputEmloyeeName();
        this.birthday = getInputBirthDay();
        this.salary = new Scanner(System.in).nextDouble();
        this.sex=new Scanner(System.in).nextBoolean();
        System.out.println("Có chon quản lí hay không ?");
        System.out.println("1. Có");
        System.out.println("2. Không");
        while (true){
            System.out.println("Nhập lựa chọn: ");
            byte choice = new Scanner(System.in).nextByte();
            switch (choice){
                case 1:
                    this.manager= getInputManager(EmloyeeList);
                    break;
                case 2:
                    break;
                default:
                    System.err.println(Message.SELECT_NOT_FOUND);
            }
            if (choice==1 || choice ==2){
                break;
            }
        }
        this.department = getInputDepartment(departmentList);


    }
    private String getInputEmloyeeId(List<Emloyee> EmloyeeList){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào mã nhân viên: ");
            String EmloyeeIdInput = sc.nextLine();
            if (EmloyeeIdInput.matches(Config.PATTERN_ID_EMPLOYEE)){
                // đúng định dạng -> kiểm tra trùng lặp
                if (EmloyeeList.stream().noneMatch(t->t.getEmloyeeId().equals(EmloyeeIdInput))){
                    // trùng lặp
                    return EmloyeeIdInput;
                }
                System.err.println(Message.ID_EXISTS);
            }else {
                System.err.println(Message.EMPLOYEE_ID_NOT_FOUND);
            }
        }
    }
    private LocalDate getInputBirthDay(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào ngày sinh dd/MM/yyyy: ");
            String EmloyeeDateInput = sc.nextLine();
            try {
                return LocalDate.parse(EmloyeeDateInput, Config.DTF);
            }catch (DateTimeParseException e){
                System.err.println(Message.ERROR_DATE);
            }
        }
    }
    private Department getInputDepartment(List<Department> departmentList){
        Scanner sc = new Scanner(System.in);
        // hiển thị danh sách phòng ban
        System.out.println("Danh sách phòng ban: ");
        for (int i = 0; i < departmentList.size(); i++) {
            System.out.printf("| STT : %d | Name : %-15s |\n",i+1,departmentList.get(i).getDepartmentName());
        }
        while (true){
            System.out.println("Nhập vào vị trí phòng ban (theo STT)");
            int index = sc.nextInt();
            if (index>=1 && index<= departmentList.size()){
                return departmentList.get(index-1);
            }
            System.err.println(Message.SELECT_NOT_FOUND);
        }
    }
    private Emloyee getInputManager(List<Emloyee> managerList){
        Scanner sc = new Scanner(System.in);
        // hiển thị danh sách người quan lí
        System.out.println("Danh sách quản lí: ");
        for (int i = 0; i < managerList.size(); i++) {
            System.out.printf("| STT : %d | Name : %-15s |\n",i+1,managerList.get(i).EmloyeeName);
        }

        while (true){
            System.out.println("Nhập vào quản lí của nhân viên (theo STT)");
            int index = sc.nextInt();
            if (index>=1 && index<= managerList.size()){
                return managerList.get(index-1);
            }
            System.err.println(Message.SELECT_NOT_FOUND);
        }
    }
    private String getInputEmloyeeName(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào tên nhân viên: ");
            String departmentNameInput = sc.nextLine();
            if (!departmentNameInput.isBlank()){
                return departmentNameInput;
            }else {
                System.err.println(Message.EMPTY_ALERT);
            }
        }
    }


    public void displayData(){
        System.out.printf("| ID : %-5s | Name : %-15s | DoB : %-10s | Sex : %-3s | Salary : %-10s | Manager: %-15s | Department : %-15s |\n",
                EmloyeeId,EmloyeeName,birthday.format(Config.DTF),sex?"Nam":"Nữ",salary,manager!=null?manager.getEmloyeeName():"null",department.getDepartmentName());
        System.out.println("----------------------------------------------------------------------------------");
    }

}
