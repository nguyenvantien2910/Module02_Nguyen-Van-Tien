package btvn.tonghop.busines.implement;

import btvn.tonghop.busines.config.InputMethod;
import btvn.tonghop.busines.design.IGenericDesign;
import btvn.tonghop.busines.config.Message;
import btvn.tonghop.busines.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static List<Department> departments = new ArrayList<>();
public static int countDepartment = 0;

public class DepartmentIpm implements IGenericDesign {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNemElement() {
        System.out.println("Nhập vào số lượng phòng ban muốn thêm : ");
        byte count = InputMethod.getByte();

        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin cho phòng ban thứ " + i);
            Department department = inputData(true);
            departments.add(department);
        }

        System.out.println(Message.ADD_SUCCESS + count + "phòng ban.");
    }

    @Override
    public void updateNemElement() {
        System.out.println("Mời bạn nhập mã phòng ban muốn chỉnh sửa : ");
        String updateId = InputMethod.getString();

        Department updateDepartment = findById(updateId);

        if (updateDepartment == null) {
            System.out.println(Message.ID_NOT_FOUND);
        } else {
            System.out.println("Nhập thông tin mới của phòng ban : ");
            updateDepartment = inputData(false);
            departments.set(departments.indexOf(updateId),updateDepartment);
            System.out.println(Message.UPDATE_SUCCESS);
        }
    }

    @Override
    public void deleteNemElement() {
        System.out.println("Nhập vào mã phòng ban muốn xóa : ");
        String deleteID = scanner.nextLine();

        Department removeDepartment = findById(deleteID);

        if ( removeDepartment == null) {
            System.out.println(Message.ID_NOT_FOUND);
        } else {
            departments.remove(removeDepartment);
            System.out.println(Message.DELETE_SUCCESS);
        }
    }

    @Override
    public void displayAll() {
        if (departments.isEmpty()) {
            System.out.println(Message.DEPARTMENT_IS_EMTY);
        } else {
            for (Department department : departments) {
                System.out.println(department);
            }
        }
    }

    @Override
    public Department findById(String id) {
        for (Department department : departments) {
            if (department.getDepartmentId().equals(id)) {
                return department;
            }
        }
        return null;
    }

    @Override
    public Department inputData(boolean isAdd) {
        //Tạo mới 1 phòng ban
        Department newDepartment = new Department();
        if (isAdd) {
            System.out.println("Nhập mã phòng ban : ");
            newDepartment.setDepartmentId(InputMethod.getString());

            System.out.println("Nhập tên phòng ban : ");
            newDepartment.setDepartmentName(InputMethod.getString());

            System.out.println("Nhập tổng số nhân viên : ");
            newDepartment.setTotalMembers(InputMethod.getInteger());

        } else {
            System.out.println("Nhập tên phòng ban : ");
            newDepartment.setDepartmentName(InputMethod.getString());

            System.out.println("Nhập tổng số nhân viên : ");
            newDepartment.setTotalMembers(InputMethod.getInteger());
        }

        return newDepartment;
    }
}
