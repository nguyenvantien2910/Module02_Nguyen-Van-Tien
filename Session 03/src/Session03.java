import java.util.Scanner;

public class Session03 {
    public static void main(String[] args) {
        // khai bao mang 1 chieu
        int[] numbers = new int[5];
        System.out.println(numbers.length);
        String[] nyc = {"a", "b", "c", "d", "e"};
        System.out.println("So phan tu cua mang " + nyc.length);

        // truy cập vào phân tu mang
        System.out.println("nyc thu 3 " + nyc[3]);

        // gan lai gia tri
        nyc[4] = "AAAAAAAAA";

        // duyet qua mang
        // cách 1:
        for (int i = 0; i < nyc.length; i++) {
            System.out.printf("%s\n", nyc[i]);
        }

        // cach 2:
        for (String item : nyc) {
            System.out.println(item);
        }


        //BTTH:
        float[] diems = new float[3];
        float sum = (float) 0;
        float DTB = (float) 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Moi ban nhap so diem :");
            diems[i] = Float.parseFloat(scanner.nextLine());
        }
        ;

        for (float diem : diems) {
            sum += diem;
        }

        DTB = sum / 3;

        System.out.println("Diem trung binh la: " + DTB);
    }



}
