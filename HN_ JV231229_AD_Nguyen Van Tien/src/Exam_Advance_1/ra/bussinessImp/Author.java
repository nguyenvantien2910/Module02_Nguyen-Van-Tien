package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;
import Exam_Advance_1.ra.config.InputMethod;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        this.authorId = inputAuthorId();
        this.authorName = inputAuthorName();
        this.sex = inputAuthorSex();
        this.year = inputYear();
    }

    private int inputYear() {
        System.out.println("Nhập năm sinh cho tác giả :");
        return InputMethod.getInteger();
    }

    private boolean inputAuthorSex() {
        System.out.println("Nhập giới tính cho tác giả : ");
        return InputMethod.getBoolean();
    }

    private String inputAuthorName() {
        System.out.println("Nhập tên tác giả : ");
        return InputMethod.getString();
    }

    private int inputAuthorId() {
        System.out.println("Nhập mã tác giả : ");
        return InputMethod.getInteger();
    }

    @Override
    public void displayData() {
        System.out.printf("| AuthorID : %-5d | Author Name : %-10s |", this.authorId, this.authorName);
    }
}
