package ra.business.implement;


import ra.business.config.ShopMessage;
import ra.business.design.IGeneric;
import ra.business.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentIplm implements IGeneric {
    public static List<Department> listDepartment = new ArrayList<>();
    public void findDepartmentByName (Scanner sc) {
        if (listDepartment.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            System.out.println("Nhập tên phòng ban muốn tìm kiếm :");
            String inputName = sc.nextLine();
            boolean isExit = false;

            for (Department department : listDepartment) {
                if (department.getName().contains(inputName)) {
                    department.displayData();
                    isExit = true;
                }
            }
            if (!isExit) {
                System.err.println(ShopMessage.NAME_NOT_FOUND);
            }
        }
    }
    @Override
    public void displayData() {
        if (listDepartment.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            for (Department department : listDepartment) {
                department.displayData();
            }
        }
    }
    @Override
    public void addNew(Scanner sc) {
        System.out.println("Nhập số lượng phòng ban muốn thêm : ");
        byte addNum = Byte.parseByte(sc.nextLine());
        for (int i = 0; i < addNum; i++) {
            Department newDepartment = new Department();
            newDepartment.inputData(sc, listDepartment,true);
            listDepartment.add(newDepartment);
        }
        System.out.println(ShopMessage.ADD_NEW_SUCESS);
    }

    @Override
    public void editInfo(Scanner sc) {
        System.out.println("Nhập vào mã phòng ban muốn thay đổi thông tin : ");
        byte inputId = Byte.parseByte(sc.nextLine());
        listDepartment.forEach(department ->  {
            if (department.getId() == inputId) {
                department.inputData(sc,listDepartment,false);
                System.out.println(ShopMessage.EDIT_SUCESS);
            }
        } );

    }

    @Override
    public void updateStatus(Scanner sc) {
        System.out.println("Nhập vào mã phòng ban muốn đổi trạng thái :");
        byte inputId = Byte.parseByte(sc.nextLine());
        boolean isExit = false;

        for (Department department : listDepartment) {
            if (department.getId() == inputId) {
                department.setStatus(!department.isStatus());
                isExit = true;
                System.out.println(ShopMessage.UPDATE_STATUS_SUCESS);
            }
        }
        if (!isExit) {
            System.err.println(ShopMessage.ID_NOT_FOUND);
        }
    }
}
