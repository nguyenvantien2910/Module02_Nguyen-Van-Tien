package ThucHanh04.rikkei;

import ThucHanh04.rikkei.academy.Student;
import ThucHanh04.rikkei.academy.Teacher;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Nguyen Van A", 18);
        students[1] = new Student("Nguyen Van B", 20);
        students[2] = new Student("Nguyen Van C", 25);

        students[0].displayInfo();
        students[2].displayInfo();
        students[1].displayInfo();

        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("Lee Qwang Dao", 20);
        teachers[1] = new Teacher("Lee Qwang Liem", 22);
        teachers[2] = new Teacher("Lee Qwang Thang", 21);

        teachers[0].displayInfo();
        teachers[1].displayInfo();
        teachers[2].displayInfo();
    }
}
