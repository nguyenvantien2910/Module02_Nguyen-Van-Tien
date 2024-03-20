package ra.stack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        // chuyển đổi từ chuỗi String  ->  Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Hùng","HN",sdf.parse("11/1/2000"),"0909473746",2500000.1,2.3f),
                new Employee(3,"Nam","HN",sdf.parse("11/10/2000"),"0900898346",2500000.1,2.1f),
                new Employee(2,"Nam","HN",sdf.parse("11/1/2002"),"0908433746",2500000.1,2.2f)
        );
        // săp xếp
        // 1 săp xêp danh sách nhân viên theo tên tăng dần / giảm dần
        // Cách Comparable
        Collections.sort(employeeList);
        System.out.println(employeeList);

        // 2 săp xêp danh sách nhân viên theo tuổi tăng dần / giảm dần

        // Comparator + lamda expression
        Collections.sort(employeeList,Comparator.comparing(Employee::getBirthday).reversed()); // method reference


        // JS : callback function

        // 3 săp xêp danh sách nhân viên theo lương tăng dần / giảm dần
        Collections.sort(employeeList,(o1, o2) ->Double.compare(o1.calTotalSalary(), o2.calTotalSalary()));

        System.out.println(employeeList);

        // 4 săp xêp danh sách nhân viên theo id tăng dần / giảm dần

        Collections.sort(employeeList,(o1, o2) -> o1.getId()-o2.getId());

        // 5 săp xêp danh sách nhân viên theo tên tăng dẫn,
        // nếu trùng tên thì sắp xếp theo id tăng dẫn

        // Comparator
        Collections.sort(employeeList,(o1, o2) -> {
            if (o1.getFullName().compareTo(o2.getFullName())!=0){
                return o1.getFullName().compareTo(o2.getFullName());
            }else{
                return o1.getId()-o2.getId();
            }
        });
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}