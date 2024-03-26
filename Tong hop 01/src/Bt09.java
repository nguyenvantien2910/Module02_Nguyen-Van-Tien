import java.util.Arrays;
import java.util.Scanner;

public class Bt09 {
    public static void main(String[] args) {
        //Bài 9: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
        //tử của mảng 1 chiều số nguyên. Nhập chỉ số phần tử cần xóa (deleteIndex)
        //và thực hiện xóa phần tử trong mảng theo deleteIndex

        //Nhập độ dài của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng : ");
        int length = Integer.parseInt(scanner.nextLine());

        //Khai báo mảng
        Integer[] integers = new Integer[length];

        //Gán giá trị cho mảng
        for (int i = 0; i < integers.length; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %d của mảng : \n", i + 1);
            integers[i] = Integer.parseInt(scanner.nextLine());
        }

        //khai báo mảng mới
        Integer[] newArr = new Integer[length- 1];

        while (true) {
            //Nhập chỉ số  phần tử cần xóa (deleteIndex)
            System.out.println("Nhập chỉ số phần từ muốn xóa (deleteIndex)");
            int deleteIndex = Integer.parseInt(scanner.nextLine());

            if (deleteIndex > 0 && deleteIndex < length) {
                //thực hiện xóa phần từ khỏi mảng theo deleteIndex
                for (int i = 0; i <= deleteIndex; i++) {
                    newArr[i] = integers[i];
                }

                for (int i = deleteIndex; i < newArr.length ; i++) {
                    newArr[i] = integers[i+1];
                }

                System.out.println("Đã xóa thành công !");
                System.out.println(Arrays.toString(newArr));
                break;
            } else {
                System.err.println("Chỉ số nhập vào không hợp lệ");
            }
        }
    }
}
