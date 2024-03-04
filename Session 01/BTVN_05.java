import java.util.Scanner;

public class BTVN_05 {
    public static void main(String[] args) {
        Double diemToan;
        Double diemLy;
        Double diemHoa;
        Double diemVan;
        Double diemAnh;
        Double diemTB;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Moi ban nhap vao diem Toan ( 0 ~ 10):");
            diemToan = Double.parseDouble(scanner.nextLine());

            if (diemToan > 0 && diemToan <= 10) {
                break;
            }
        }

        while (true) {
            System.out.println("Moi ban nhap vao diem Ly ( 0 ~ 10):");
            diemLy = Double.parseDouble(scanner.nextLine());

            if (diemLy > 0 && diemLy <= 10) {
                break;
            }
        }

        while (true) {
            System.out.println("Moi ban nhap vao diem Hoa ( 0 ~ 10):");
            diemHoa = Double.parseDouble(scanner.nextLine());

            if (diemHoa > 0 && diemHoa <= 10) {
                break;
            }
        }

        while (true) {
            System.out.println("Moi ban nhap vao diem Van ( 0 ~ 10):");
            diemVan = Double.parseDouble(scanner.nextLine());

            if (diemVan > 0 && diemVan <= 10) {
                break;
            }
        }

        while (true) {
            System.out.println("Moi ban nhap vao diem Anh ( 0 ~ 10):");
            diemAnh = Double.parseDouble(scanner.nextLine());

            if (diemAnh > 0 && diemAnh <= 10) {
                break;
            }
        }

        diemTB = (diemAnh + diemHoa + diemToan + diemLy + diemVan) / 5;

        System.out.printf("Diem trung binh cac mon la : %.2f\n", diemTB);

        if (diemTB >= 0 && diemTB < 5) {
            System.out.println("Xep loai yeu");
        } else if (diemTB >= 5 && diemTB < 6.5) {
            System.out.println("Xep loai trung binh");
        } else if (diemTB >= 6.5 && diemTB < 8) {
            System.out.println("Xep loai kha");
        } else if (diemTB >= 8 && diemTB < 9) {
            System.out.println("Xep loai gioi");
        } else {
            System.out.println("Xep loai xuat xac");
        }
    }
}
