package BTVN.business.entity;

public class Employee {
    private String employeeId,employeeName, employeeDOB, getEmployeeAdress;
    private Boolean gender;

    private Integer basicSalary, rate, phone, salary;

    public Employee() {
    }

    public Employee(String employeeName, String employeeDOB, String getEmployeeAdress, Boolean gender, Integer basicSalary, Integer rate, Integer phone) {
        this.employeeName = employeeName;
        this.employeeDOB = employeeDOB;
        this.getEmployeeAdress = getEmployeeAdress;
        this.gender = gender;
        this.basicSalary = basicSalary;
        this.rate = rate;
        this.phone = phone;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public String getGetEmployeeAdress() {
        return getEmployeeAdress;
    }

    public void setGetEmployeeAdress(String getEmployeeAdress) {
        this.getEmployeeAdress = getEmployeeAdress;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
