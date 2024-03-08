public class MainTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentCode("SV001");
        student1.setStudentName("Nguyen Van Liem");
        student1.setAge(18);
        student1.setSex(false);

        Student student2 = new Student("SV002", "Nguyen Van Tien", 18, true);

        System.out.printf("Thông tin của sinh viên 1: Tên %s\n", student1.getStudentName());
        System.out.printf("Thông tin của sinh viên 2: Tuổi %d\n", student2.getAge());

        student1.displayData();
    }
}