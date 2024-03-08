public class Student {

    // Tạo trường
    private String studentCode;
    private String studentName;
    private Integer age;
    private Boolean sex;

    // Tạo constructor không truyền tham số
    public Student() {};

    // Tạo constructor truyền đủ tham số
    public Student(String studentCode, String studentName, Integer age, Boolean sex) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
    }

    // Tạo phương thức displayData()
    public void displayData() {
        System.out.printf("Tên sinh viên là : %s\n", studentName);
        System.out.printf("Mã sinh viên là : %s\n", studentCode);
        System.out.printf("Tuổi của sinh viên là : %d\n", age);
        System.out.printf("Giới tính của  sinh viên là : %b\n", sex);
    }

    // Phương thức Getter
    public String getStudentCode() {
        return studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getSex() {
        return sex;
    }

    // Phương thức Setter
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}