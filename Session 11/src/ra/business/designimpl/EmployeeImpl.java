package ra.business.designimpl;

import ra.business.design.IEmployee;
import ra.business.design.IGenericDesign;
import ra.business.entity.Employee;
import ra.config.InputMethods;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements IEmployee {
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addNewElement() {
        System.out.println("Nhập vào số lượng cần thêm");
        byte count = InputMethods.getByte();

        // duyệt
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + i);
            Employee employee = inputData(true);
            // thêm vào list
            employeeList.add(employee);
        }

        System.out.println("Đa thêm thanh công " + count + " nhân viên");
    }

    @Override
    public Employee findById(Integer id) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void editElement() {
        System.out.println("Nhập id của nhân viên cần sử thông tin");
        int idEdit = InputMethods.getInteger();
        Employee employeeEdit = findById(idEdit);
        if (employeeEdit == null) {
            System.err.println("Khong tim thay");
        } else {
            // hiển thi thông tin cũ
            System.out.println("thông tin cũ là :");
            System.out.println(employeeEdit);
            System.out.println("Nhập thông tin mới");
            employeeEdit = inputData(false);
            employeeEdit.setId(idEdit); // ko thay đổi id
            // set nó la vào danh sách
            employeeList.set(employeeList.indexOf(findById(idEdit)),employeeEdit);
            System.out.println("Đã cập nhật thông tin");
        }
    }

    @Override
    public void deleteElement() {
        System.out.println("Nhập id của nhân viên cần xóa");
        int idDel = InputMethods.getInteger();
        Employee employeeDel = findById(idDel);
        if (employeeDel == null) {
            System.err.println("Khong tim thay");
        } else {
            employeeList.remove(employeeDel);
            System.out.println("Xóa thanh công");
        }
    }

    @Override
    public void displayAll() {
        if (employeeList.isEmpty()){
            System.err.println("Danh sach rỗng");
        }else {
            for (Employee e : employeeList){
                System.out.println(e);
            }
        }
    }

    @Override
    public Employee inputData(boolean isAdd) {
        Employee newEm = new Employee();
        if (isAdd) {
            newEm.setId(getNewId()); // id tự tăng
            System.out.println("ID : " + newEm.getId());
        }
        System.out.println("Nhập tên :");
        newEm.setFullName(InputMethods.getString());
        System.out.println("Nhập địa chỉ :");
        newEm.setAddress(InputMethods.getString());
        System.out.println("Nhập nagy sinh(dd-MM-yyyy) :");
        newEm.setBirthday(InputMethods.getDate());
        System.out.println("Nhập sdt :");
        newEm.setPhone(InputMethods.getString());
        System.out.println("Nhập lương :");
        newEm.setSalary(InputMethods.getDouble());
        System.out.println("Nhập he so :");
        newEm.setRate(InputMethods.getFloat());
        return newEm;
    }

    @Override
    public int getNewId() {
        int idMax = 0;
        for (Employee e :employeeList){
            if (idMax<e.getId()){
                idMax = e.getId();
            }
        }
        return idMax+1;
    }
}
