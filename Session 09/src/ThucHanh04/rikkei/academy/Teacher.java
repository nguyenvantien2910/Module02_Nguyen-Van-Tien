package ThucHanh04.rikkei.academy;

public class Teacher extends Persion{
    public Teacher() {
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên giáo viên : " + this.getName());
        System.out.println("Tuổi của giáo viên : " + this.getAge());
        System.out.println("----------------------------------------");
    }
}
