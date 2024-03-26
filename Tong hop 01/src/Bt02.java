import java.util.Scanner;

public class Bt02 {
    public static void main(String[] args) {
        //Bài 2: Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá
        //trị các phần tử của mảng một chiều số thực gồm n phần tử. In ra giá trị
        //trung bình cộng của các phần tử trong mảng

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào độ dài của mảng : ");
        int length = Integer.parseInt(scanner.nextLine());

        Double[] doubles = new Double[length];
        double sum = 0;

        for (int i = 0; i < doubles.length; i++) {
            System.out.printf("Mời bạn nhập giá trị cho phần từ thứ %d của mảng :\n", i + 1);
            doubles[i] = Double.parseDouble(scanner.nextLine());
            sum += doubles[i];
        }

        System.out.println("Giá trị trung bình cộng của mảng là : " + sum / doubles.length);
    }
}
