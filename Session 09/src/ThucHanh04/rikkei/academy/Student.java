package ThucHanh04.rikkei.academy;

public class Student extends Persion{
    public Student() {
    }

    public Student(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên học sinh : " + this.getName());
        System.out.println("Tuổi của  học sinh : " + this.getAge());
        System.out.println("----------------------------------------");
    }
}
