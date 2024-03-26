import java.util.Scanner;

public class Bt07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập đồ dài mảng
        System.out.println("Nhập độ dài của mảng : ");
        int size = Integer.parseInt(scanner.nextLine());

        //Gán giá trị cho mảng
        Integer[] integers = new Integer[size];
        for (int i = 0; i < integers.length; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %d của mảng : \n", i + 1);
            integers[i] = Integer.parseInt(scanner.nextLine());
        }
        //Khai báo mảng mới + các giá trị cần thiết
        Integer[] newArr;
        int addValue;
        int addIndex;

        while (true) {
            //Nhập giá trị và chỉ số muốn chèn
            System.out.println("Nhập giá trị (addValue)");
            addValue = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập chỉ số chèn (addIndex)");
            addIndex = Integer.parseInt(scanner.nextLine());

            if (addIndex < 0) {
                System.out.println("Giá trị nhập vào không hợp lệ, mời nhập lại !");

            } else {
                if (addIndex > size) {
                    newArr = new Integer[addIndex];
                    for (int i = 0; i < size; i++) {
                        newArr[i] = integers[i];
                    }
                    newArr[addIndex - 1] = addValue;
                } else {
                    newArr = new Integer[size + 1];
                    for (int i = 0; i < newArr.length; i++) {
                        if (i < addIndex) {
                            newArr[i] = integers[i];
                        } else if (addIndex == i) {
                            newArr[i] = addValue;
                        } else {
                            newArr[i] = integers[i - 1];
                        }
                    }
                }

                System.out.println("Mảng mới sau khi chèn:");
                for (int i = 0; i < newArr.length; i++) {
                    System.out.println(newArr[i]);
                }
                break;
            }
        }
    }
}
