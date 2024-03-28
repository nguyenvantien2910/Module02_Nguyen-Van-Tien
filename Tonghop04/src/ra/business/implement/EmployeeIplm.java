package ra.business.implement;

import ra.business.config.ShopMessage;
import ra.business.design.IGeneric;
import ra.business.entity.Employee;

import java.time.LocalDate;
import java.util.*;

import static ra.business.implement.DepartmentIplm.listDepartment;
import static ra.presentation.Management.choice;
import static ra.presentation.Management.sc;

public class EmployeeIplm implements IGeneric {
    public static List<Employee> listEmployee = new ArrayList<>();

    public void sortEmployeeByName() {
        listEmployee.sort(Comparator.comparing(Employee::getFullName));
        System.out.print("Danh sách nhân viên sau khi sắp xếp theo tên :\n");
        displayData();
    }

    public void displayEmployeeByDepartment() {
        if (listEmployee.isEmpty()) {
            System.err.println(ShopMessage.EMPLOYEE_EMTY);
        } else {
            System.out.println("Chọn phòng ban :");
            for (int i = 0; i < listDepartment.size(); i++) {
                if (listDepartment.get(i).isStatus()) {
                    System.out.printf("%d.%s\n", i + 1, listDepartment.get(i).getName());
                }
            }

            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = Byte.parseByte(sc.nextLine());
            boolean isExit = false;

            for (Employee employee : listEmployee) {
                if (employee.getDepartment().getId() == choice) {
                    employee.displayData();
                    isExit = true;
                }
            }

            if (!isExit) {
                System.err.println(ShopMessage.EMPLOYEE_EMTY);
            }
        }
    }

    public void displayAllData() {
        if (listEmployee.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            int firstIndexOfPage = 0;
            int lastIndexOfPage = 2;
            int elementPerPage = 3;
            int page = 1;
            int numberOfPage;
            if (listEmployee.size() % elementPerPage == 0) {
                numberOfPage = listEmployee.size() / elementPerPage;
            } else {
                numberOfPage = listEmployee.size() / elementPerPage + 1;
            }
            do {
                for (int i = 0; i < listEmployee.size(); i++) {
                    if (i >= firstIndexOfPage && i <= lastIndexOfPage) {
                        listEmployee.get(i).displayData();
                    }
                }

                System.out.println("Trang : " + page + "/" + numberOfPage);
                if (page == 1) {
                    System.out.println("2.Trang sau");
                    System.out.println("3.Thoát");
                } else if (page == numberOfPage) {
                    System.out.println("1.Trang Trước");
                    System.out.println("3.Thoát");
                } else {
                    System.out.println("1.Trang trước  ||  2.Trang sau");
                    System.out.println("3.Thoát");
                }

                System.out.println("Mời nhập lựa chọn: ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        if (page <= numberOfPage && page >= 0) {
                            firstIndexOfPage -= elementPerPage;
                            lastIndexOfPage -= elementPerPage;
                            page -= 1;
                            break;
                        }
                    case 2:
                        if (page <= numberOfPage && page >= 0) {
                            firstIndexOfPage += elementPerPage;
                            lastIndexOfPage += elementPerPage;
                            page += 1;
                            break;
                        }
                    case 3:
                        return;
                    default:
                        System.err.print(ShopMessage.SELECT_NOT_FOUND);
                        break;
                }
            } while (true);
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
            System.out.printf("Nhập thông tin cho nhân viên thứ %d\n", i + 1);
            newEmployee.inputData(sc, listEmployee, listDepartment, true);
            listEmployee.add(newEmployee);
        }
        System.out.println(ShopMessage.ADD_NEW_SUCESS);
    }

    @Override
    public void editInfo(Scanner sc) {
        if (listEmployee.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            System.out.println("Nhập vào mã nhân viên muốn thay đổi thông tin : ");
            byte inputId = Byte.parseByte(sc.nextLine());
            listEmployee.forEach(employee -> {
                if (employee.getId() == inputId) {
                    while (true) {
                        System.out.println("Lựa chọn thông tin muốn thay đổi :");
                        System.out.println("1. Thay đổi tên");
                        System.out.println("2. Thay đĩa chỉ");
                        System.out.println("3. Thay đổi số điện thoại");
                        System.out.println("4. Thay đổi phòng ban");
                        System.out.println("5. Thay đổi ngày tháng năm sinh");
                        System.out.println("6. Thay đổi trạng thái");
                        System.out.println("7. Thoát");

                        System.out.print("Lựa chọn của bạn : ");

                        choice = Byte.parseByte(sc.nextLine());

                        switch (choice) {
                            case 1:
                                do {
                                    System.out.println("Mời nhập tên nhân viên :");
                                    String inputName = sc.nextLine();
                                    if (inputName.trim().isBlank()) {
                                        System.err.println(ShopMessage.FIELD_EMTY_ERROR);
                                    } else {
                                        employee.setFullName(inputName);
                                        System.out.println(ShopMessage.EDIT_SUCESS);
                                        break;
                                    }
                                } while (true);

                            case 2:
                                do {
                                    System.out.println("Mời bạn nhập địa chỉ:");
                                    String inputAddress = sc.nextLine();
                                    if (inputAddress.isBlank()) {
                                        System.err.println(ShopMessage.FIELD_EMTY_ERROR);
                                    } else {
                                        employee.setAddress(inputAddress);
                                        System.out.println(ShopMessage.EDIT_SUCESS);
                                        break;
                                    }

                                } while (true);
                            case 3:
                                updatePhone(sc, employee);
                            case 4:
                                if (UpdateDepartment(sc, employee)) break;
                            case 5:
                                updateBirthDay(sc, employee);
                            case 6:
                                updateStatus(employee);
                                break;
                            case 7:
                                return;
                            default:
                                System.err.println(ShopMessage.SELECT_NOT_FOUND);
                        }
                    }
                    //employee.inputData(sc, listEmployee, listDepartment, false);
                }
            });
        }
    }

    private static void updatePhone(Scanner sc, Employee employee) {
        do {
            System.out.println("Mời bạn nhập số điện thoại : ");
            String inputPhoneNum = sc.nextLine();
            if (inputPhoneNum.matches(ShopMessage.REGEX_PHONE_VN)) {
                employee.setPhone(inputPhoneNum);
                System.out.println(ShopMessage.EDIT_SUCESS);
                break;
            } else {
                System.err.println(ShopMessage.PHONE_REGEX_ERROR);
            }
        } while (true);
    }

    private static boolean UpdateDepartment(Scanner sc, Employee employee) {
        if (listDepartment.isEmpty()) {
            employee.setDepartment(null);
        } else {
            System.out.println("Chọn phòng ban : ");
            for (int i = 0; i < listDepartment.size(); i++) {
                if (listDepartment.get(i).isStatus()) {
                    System.out.printf("%d. %s\n", i + 1, listDepartment.get(i).getName());
                }
            }
            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = Byte.parseByte(sc.nextLine());
            listDepartment.get(choice - 1).setNumberEmployee(listDepartment.get(choice - 1).getNumberEmployee() + 1);
            employee.setDepartment(listDepartment.get(choice - 1));
            int currentNum = listEmployee.get(choice - 1).getDepartment().getNumberEmployee();
            listEmployee.get(choice - 1).getDepartment().setNumberEmployee(currentNum - 1);
            System.out.println(ShopMessage.EDIT_SUCESS);
            return true;
        }
        return false;
    }

    private static void updateStatus(Employee employee) {
        employee.setStatus(!employee.isStatus());
        System.out.println(ShopMessage.EDIT_SUCESS);
    }

    private static void updateBirthDay(Scanner sc, Employee employee) {
        do {
            System.out.println("Mời nhập ngày tháng năm sinh (dd-MM-yyy):");
            String inputDate = sc.nextLine();
            try {
                LocalDate dateOfBirth = LocalDate.parse(inputDate, ShopMessage.DTF);
                employee.setDateOfBirth(dateOfBirth);
                System.out.println(ShopMessage.EDIT_SUCESS);
                break;
            } catch (Exception ex) {
                System.err.println(ShopMessage.COMMON_ERROR);
            }

        } while (true);
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
