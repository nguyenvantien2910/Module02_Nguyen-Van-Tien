package BTVN06;

public class Test {
    public static void main(String[] args) {
        Employee nv1 = new Employee("a1", "NV1", 18, true, 2.5);
        Employee nv2 = new Employee();
        nv2.inputData();
        nv1.calSalary();
        nv2.calSalary();
        System.out.println(nv1.displayData());
        System.out.println(nv2.displayData());
    }
}
