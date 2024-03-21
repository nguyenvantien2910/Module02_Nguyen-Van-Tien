package btvn.tonghop.busines.entity;

import java.time.LocalDate;

public class Employee {
    private String employeeId, employeeName;

    private LocalDate birthday;

    private boolean sex;

    private int salary;

    private Employee manager;
}
