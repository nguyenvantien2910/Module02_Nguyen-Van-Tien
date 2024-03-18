package ra.presentation;

import ra.business.design.IEmployee;
import ra.business.designimpl.EmployeeImpl;
import ra.config.InputMethods;

public class EmployeeManagement {
    private IEmployee employeeImpl = new EmployeeImpl();

    public void displayEmployeeMenu() {
        while (true) {
            System.out.println("-----------Employee Menu ------------");
            System.out.println("1. Thêm mới");
            System.out.println("2. Sửa");
            System.out.println("3. xóa");
            System.out.println("4. hiển thị");
            System.out.println("0. Quay lại");
            System.out.println("Nhâp lưa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    employeeImpl.addNewElement();
                    break;
                case 2:
                    employeeImpl.editElement();
                    break;
                case 3:
                    employeeImpl.deleteElement();
                    break;
                case 4:
                    employeeImpl.displayAll();
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Nha ko dung lua chọn, nhạp lại");
            }
        }
    }
}
