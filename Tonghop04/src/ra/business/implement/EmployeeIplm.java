package ra.business.implement;

import ra.business.config.ShopMessage;
import ra.business.design.IGeneric;
import ra.business.entity.Employee;

import java.util.*;

import static ra.business.implement.DepartmentIplm.listDepartment;
import static ra.presentation.Management.sc;

public class EmployeeIplm implements IGeneric {
    public static List<Employee> listEmployee = new ArrayList<>();

    public void sortEmployeeByName() {
        Collections.sort(listEmployee, Comparator.comparing(Employee::getFullName));
        System.out.printf("Danh sách nhân viên sau khi sắp xếp theo tên :\n");
        displayData();
    }

    public void displayEmployeeByDepartment() {
        System.out.println("Chọn phòng ban :");
        for (int i = 0; i < listDepartment.size(); i++) {
            if (listDepartment.get(i).isStatus()) {
                System.out.printf("%d.%s", i + 1, listDepartment.get(i).getName());
            }
        }

        System.out.print("Nhập lựa chọn của bạn : ");
        byte choice = Byte.parseByte(sc.nextLine());
        boolean isExit = false;

        for (Employee employee : listEmployee) {
            if (employee.getDepartment().getId() == choice -1) {
                employee.displayData();
                isExit = true;
            }
        }

        if (!isExit) {
            System.err.println(ShopMessage.EMPLOYEE_EMTY);
        }
    }

    @Override
    public void displayData() {
        if (listEmployee.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            for (Employee employee : listEmployee) {
                employee.displayData();
            }
        }
    }

    @Override
    public void addNew(Scanner sc) {
        System.out.println("Nhập số lượng nhân viên muốn thêm : ");
        byte addNum = Byte.parseByte(sc.nextLine());
        for (int i = 0; i < addNum; i++) {
            Employee newEmployee = new Employee();
            newEmployee.inputData(sc, listEmployee,listDepartment,true);
            listEmployee.add(newEmployee);
        }
        System.out.println(ShopMessage.ADD_NEW_SUCESS);
    }

    @Override
    public void editInfo(Scanner sc) {
        System.out.println("Nhập vào mã nhân viên muốn thay đổi thông tin : ");
        byte inputId = Byte.parseByte(sc.nextLine());
        listEmployee.forEach(employee ->  {
            if (employee.getId() == inputId) {
                employee.inputData(sc,listEmployee, listDepartment, false);
                System.out.println(ShopMessage.EDIT_SUCESS);
            }
        } );
    }

    @Override
    public void updateStatus(Scanner sc) {
        System.out.println("Nhập vào mã nhân viên muốn đổi trạng thái :");
        byte inputId = Byte.parseByte(sc.nextLine());
        boolean isExit = false;

        for (Employee employee : listEmployee) {
            if (employee.getId() == inputId) {
                employee.setStatus(!employee.isStatus());
                isExit = true;
                System.out.println(ShopMessage.UPDATE_STATUS_SUCESS);
            }
        }
        if (!isExit) {
            System.err.println(ShopMessage.ID_NOT_FOUND);
        }
    }
}
