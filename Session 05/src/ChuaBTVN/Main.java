package ChuaBTVN;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee nv1 = new Employee("NV001", "Nguyen Van Tien", "Male", 18, 2);
        nv1.calSalary();

        Employee nv2 = new Employee();
        nv2.inputData();
        nv2.setSalary(nv1.calSalary());

        System.out.println(nv1.displayData());
        System.out.println("------------");
        System.out.println(nv2.displayData());
    }
}