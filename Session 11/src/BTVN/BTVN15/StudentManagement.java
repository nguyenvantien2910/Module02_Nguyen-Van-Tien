package BTVN.BTVN15;

import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    public void showAll(List<Student> listStudent) {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student, List<Student> listStudent) {
        listStudent.add(student);
    }

    public void removeStudent(int studentId, List<Student> listStudent) {
        for (Student student : listStudent) {
            if (student.getStudenID() == studentId) {
                listStudent.remove(student);
                return;
            }
        }
        System.out.println("Không tìm thấy ID phù hợp !");
    }

    public void findStudentById(int studentId, List<Student> listStudent) {
        boolean found = false;
        for (Student student : listStudent) {
            if (student.getStudenID().equals(studentId)) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy ID phù hợp !");
        }
    }

    public double getAverageScore(List<Student> listStudent) {
        if (listStudent.isEmpty()) {
            System.out.println("Không có học sinh !");
            return 0;
        }

        double totalScore = 0;
        for (Student student : listStudent) {
            totalScore += student.getOverScore();
        }
        return totalScore / listStudent.size();
    }

    public void sortByScore(List<Student> students) {
            students.sort(Comparator.comparing(Student::getOverScore));
    }
}
