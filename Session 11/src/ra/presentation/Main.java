package ra.presentation;


import ra.config.InputMethods;

public class Main {
    private static EmployeeManagement employeeManagement = new EmployeeManagement();
    public static void main(String[] args) {
        while (true){
            System.out.println("MENU");
            System.out.println("1.Quanrn lý phong ban");
            System.out.println("2.Quan lý nhân viên");
            System.out.println("Nhâp lưa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:

                    break;
                case 2:
                    employeeManagement.displayEmployeeMenu();
                    break;
                default:
                    System.err.println("Nhpaj sai");
            }

        }
    }
}