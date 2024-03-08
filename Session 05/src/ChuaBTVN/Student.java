package ChuaBTVN;

import java.util.Scanner;

//khai báo các trường cho lớp Sinhvien
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phonenumber;

    // khai báo constructor Sinhvien không tham số
    public Student() {

    }

    //khai báo constructor có tham số
    public Student(int id, String name, int age, String gender, String address, String phonenumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void inputData(Scanner scanner) {
        System.out.println("nhập vào id sinh viên: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào tên sinh viên: ");
        name = scanner.nextLine();
        System.out.println("nhập vào giới tính sinh viên (Male/Female): ");
        gender = scanner.nextLine();
        System.out.println("nhập vào tuoi cua sinh viên: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào địa chỉ sinh viên: ");
        address = scanner.nextLine();
        System.out.println("nhập vào số điện thoại sinh viên: ");
        phonenumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phonenumber + '\'' +
                '}');

    }
}