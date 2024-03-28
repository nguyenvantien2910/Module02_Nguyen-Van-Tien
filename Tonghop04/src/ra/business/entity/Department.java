package ra.business.entity;

import ra.business.config.ShopMessage;

import java.util.List;
import java.util.Scanner;

public class Department {
    private int id;
    private String name;
    private int numberEmployee;
    private boolean status;

    public Department() {
    }

    public Department(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberEmployee=" + numberEmployee +
                ", status=" + status +
                '}';
    }

    public void displayData() {
        System.out.printf("|ID: %-5d | Name: %-20s | Number Employee: %-5d | Status: %-5b%n", this.id, this.name, this.numberEmployee, this.status);
    }

    public void inputData(Scanner sc, List<Department> listDepartment, boolean isAdd) {
        if (isAdd) {
            this.id = findMaxID(listDepartment);
        }
        this.name = inputDepartmentName(sc, listDepartment);
        this.status = inputStatus(sc);
    }

    private int findMaxID(List<Department> listDepartment) {
        int maxId = 0;
        for (int i = 0; i < listDepartment.size(); i++) {
            if (listDepartment.get(i).getId() > maxId) {
                maxId = listDepartment.get(i).getId();
            }
        }
        return maxId + 1;
    }

    private boolean inputStatus(Scanner sc) {
        while (true) {
            System.out.println("Mời bạn nhập trạng thái của phòng ban (true/false): ");
            String inputStatus = sc.nextLine();

            if (inputStatus.equals("true") || inputStatus.equals("false")) {
                return Boolean.parseBoolean(inputStatus);
            } else {
                System.err.println("Nhập không hợp lệ, vui lòng nhập lại (true/false)");
            }
        }
    }

    private String inputDepartmentName(Scanner sc, List<Department> listDepartment) {
        while (true) {
            System.out.println("Mời bạn nhập tên phòng ban: ");
            String inputName = sc.nextLine().trim();

            if (inputName.isEmpty()) {
                System.err.println(ShopMessage.FIELD_EMTY_ERROR);
                continue;
            }

            boolean exists = false;
            for (Department department : listDepartment) {
                if (department.getName().equalsIgnoreCase(inputName)) {
                    exists = true;
                    System.err.println(ShopMessage.FIELD_EMTY_ERROR);
                    break;
                }
            }

            if (!exists) {
                return inputName;
            }
        }
    }
}
