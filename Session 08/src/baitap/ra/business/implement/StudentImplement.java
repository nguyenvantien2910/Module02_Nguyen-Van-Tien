package baitap.ra.business.implement;

import baitap.ra.business.config.InputMethods;
import baitap.ra.business.design.CRUD;
import baitap.ra.business.entity.Student;

public class StudentImplement implements CRUD {
    private static Student[] students = new Student[100];
    private int size = 0;

    @Override
    public void create() {
        if (size == 100) {
            System.err.println("mảng đầy");
        } else {
            // logic thêm mới
            // ta 1 đối tượng student
            Student newStudent = new Student();
            newStudent.inputData();
            // thêm vào mang
            students[size] = newStudent;
            size++; // tăng số lương
        }
    }

    @Override
    public void display() {
        if (size == 0) {
            System.err.println("mảng ko co ptu");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(students[i]);
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập ID sinh viên muốn sửa : ");
        int editNum = InputMethods.getInteger();

        boolean isExit = false;
        for (int i = 0; i < size; i++) {
            if (editNum == students[i].studentId) {
                students[i].inputData();
                isExit = true;
                System.out.println("Thực hiện thay đổi thông tin sinh viên thành công !");
                break;
            }
        }

        if (!isExit) {
            System.out.println("ID đã nhập không tồn tại !");
        }
    }

    @Override
    public void delete() {
        System.out.println("Mời nhập ID của sinh viên muốn thực hiện xóa :");
        int deleteNum = InputMethods.getInteger();

        boolean isExit = false;

        for (int i = 0; i < size; i++) {
            if (deleteNum == students[i].getStudentId()) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                size--;
                isExit = true;
                System.out.println("Thực hiện xóa sinh viên thành công");
                break;
            }
        }

        if (!isExit) {
            System.out.println("ID đã nhập không tồn tại !");
        }
    }
}
