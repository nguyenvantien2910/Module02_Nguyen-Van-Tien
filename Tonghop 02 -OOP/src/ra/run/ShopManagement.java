package ra.run;

import ra.entity.Categories;
import ra.entity.Product;

import java.util.Scanner;

public class ShopManagement {
    public static Scanner scanner = new Scanner(System.in);
    static byte choise;
    private static Product[] arrProduct = new Product[100];
    private static Categories[] arrCategories = new Categories[100];
    private static int lengthProduct = 0;
    private static int lengthCategories = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("******************SHOP MENU*******************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");

            System.out.println("Mời bạn nhập giá trị muốn lựa chọn : ");

            choise = Byte.parseByte(scanner.nextLine());

            switch (choise) {
                case 1:
                    categoriesManegement();
                    break;
                case 2:
                    productsManegement();
                    break;
                case 3:
                    System.out.println("Đã thực hiện thoát chương trình !");
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
            }
        }
    }

    private static void productsManegement() {
        while (true) {
            System.out.println("*******************PRODUCT MANAGEMENT*****************");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)");
            System.out.println("8. Thoát");

            System.out.println("Mời bạn nhập lựa chọn muốn thực hiện : ");
            choise = Byte.parseByte(scanner.nextLine());

            switch (choise) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    displayProductInfo();
                    break;
                case 3:
                    sortProductByPrice();
                    break;
                case 4:
                    updateProductById();
                    break;
                case 5:
                    deleteProductById();
                    break;
                case 6:
                    findProdutByName();
                    break;
                case 7:
                    findProductByPriceRange();
                    break;
                case 8:
                    System.out.println("Đã quay lại menu SHOP MANAGEMENT !");
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ, mời nhập lại!");
            }
        }

    }

    private static void updateProductById() {
        if (lengthProduct == 0) {
            System.err.println("Không có sản phầm nào !");
        } else {
            System.out.println("Nhập mã sản phẩm muốn sửa");
            String idEdit = scanner.nextLine();
            for (int i = 0; i < lengthProduct; i++) {
                if (arrProduct[i].getProductId().equals(idEdit)) {
                    arrProduct[i].inputData(scanner, arrProduct, arrCategories, lengthCategories);
                }
            }
        }
    }

    private static void deleteProductById() {
        if (lengthProduct == 0) {
            System.err.println("Không có sản phầm nào !");
        } else {
            System.out.println("Nhập mã sản phẩm muốn xóa: ");
            String idDelete = scanner.nextLine();
            int index = -1;
            for (int i = 0; i < lengthProduct; i++) {
                if (arrProduct[i].getProductId().equals(idDelete)) {
                    index = i;
                }
            }
            if (index != -1) {
                for (int i = index; i < lengthProduct - 1; i++) {
                    arrProduct[i] = arrProduct[i + 1];
                }
                lengthProduct--;
                System.out.println("Đã xóa sản pẩm có mã là : " + idDelete);
            } else {
                System.err.println("Ko tìm thấy sản phẩm có mã là : " + idDelete);
            }
        }
    }

    private static void findProdutByName() {
        if (lengthProduct == 0) {
            System.err.println("Không có sản phầm nào !");
        } else {
            System.out.println("Nhập tên sản phẩm muốn tìm kiếm : ");
            String searchNameProduct = scanner.nextLine();
            boolean foundProduct = false;
            for (Product p : arrProduct) {
                if (p != null && p.getProductName().toLowerCase().contains(searchNameProduct)) {
                    p.display();
                    foundProduct = true;
                }
            }
            if (!foundProduct) {
                System.err.println("Không tìm thấy sản phẩm với tên là : " + searchNameProduct + "\"");
            }
        }

    }

    private static void findProductByPriceRange() {
        if (lengthProduct == 0) {
            System.err.println("Không có sản phầm nào !");
        } else {
            System.out.println("Nhập khoảng giá bạn muốn tìm kiếm (a – b)");
            System.out.print("Nhập giá thấp nhất (a): ");
            float priceLow = Float.parseFloat(scanner.nextLine());
            System.out.print("Nhập giá cao nhất (b): ");
            float priceHigh = Float.parseFloat(scanner.nextLine());
            boolean foundProduct1 = false;
            for (Product p : arrProduct) {
                if (p != null && p.getPrice() >= priceLow && p.getPrice() <= priceHigh) {
                    p.display();
                    foundProduct1 = true;
                }
            }
            if (!foundProduct1) {
                System.out.println("Không tìm thấy sản phẩm nào trong khoảng giá từ " + priceLow + " đến " + priceHigh);
            }
        }
    }

    private static void sortProductByPrice() {
        if (lengthProduct == 0) {
            System.err.println("Không có sản phầm nào !");
        } else {
            for (int i = 0; i < lengthProduct; i++) {
                for (int j = 0; j < lengthProduct - i - 1; j++) {
                    if (arrProduct[i].getPrice() < arrProduct[j + 1].getPrice()) {
                        Product temp = arrProduct[j];
                        arrProduct[j] = arrProduct[j + 1];
                        arrProduct[j + 1] = temp;
                    }
                }
            }
            System.out.println("Danh sách sản phẩm sắp xếp theo giá giảm dần ");
            for (int i = 0; i < lengthProduct; i++) {
                arrProduct[i].display();
            }
        }
    }

    private static void displayProductInfo() {
        if (lengthProduct == 0) {
            System.err.println("Không có sản phầm nào để hiển thị ");
        } else {
            for (int i = 0; i < lengthProduct; i++) {
                arrProduct[i].display();
            }
        }
    }

    private static void addNewProduct() {
        if (lengthCategories == 0) {
            System.err.println("Danh mục đang trống, cần thêm danh mục trước !");
            return;
        }
        System.out.println("Nhập số lượng sản phẩm muốn thêm mới : ");
        int addNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < addNum; i++) {
            Product product = new Product();
            product.inputData(scanner, arrProduct, arrCategories, lengthCategories);
            arrProduct[lengthProduct++] = product;
        }
    }

    private static void categoriesManegement() {
        while (true) {
            System.out.println("********************CATEGORIES MENU***********");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");

            System.out.println("Mời bạn nhập lựa chọn muốn thực hiện : ");
            choise = Byte.parseByte(scanner.nextLine());

            switch (choise) {
                case 1:
                    addNewCate();
                    break;
                case 2:
                    displayCateInfo();
                    break;
                case 3:
                    updateCateInfo();
                    break;
                case 4:
                    deleteCate();
                    break;
                case 5:
                    updateCateStatus();
                    break;
                case 6:
                    System.out.println("Đã quay lại menu SHOP MANAGEMENT !");
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ, mời nhập lại!");
            }
        }
    }

    private static void updateCateStatus() {
        if (lengthCategories == 0) {
            System.err.println("Danh mục hiện tại đang trống !");
        } else {
            System.out.println("Nhập mã danh mục muốn cập nhật trạng thái :");
            int idUpdate = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < lengthCategories; i++) {
                if (arrCategories[i].getCategoryId() == idUpdate) {
                    arrCategories[i].setCatalogStatus(!arrCategories[i].isCatalogStatus());
                    System.out.println("Đã cập nhật trạng thái danh mục có mã là :  " + idUpdate);
                    break;
                }
            }
        }
    }

    private static void deleteCate() {
        if (lengthCategories == 0) {
            System.err.println("Danh mục hiện tại đang trống !");
        } else {
            System.out.println("Nhập mã danh mục muốn thực hiện xóa : ");
            Byte deleteNum = Byte.parseByte(scanner.nextLine());

            int index = -1;
            for (int i = 0; i < lengthCategories; i++) {
                if (arrCategories[i].getCategoryId() == deleteNum) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                // Kiểm tra xem danh mục có chứa sản phẩm không
                boolean hasProduct = false;
                for (Product product : arrProduct) {
                    if (product != null && product.getCatalogId() == deleteNum) {
                        hasProduct = true;
                        break;
                    }
                }
                if (!hasProduct) {
                    for (int i = index; i < lengthCategories - 1; i++) {
                        arrCategories[i] = arrCategories[i + 1];
                    }
                    arrCategories[lengthCategories - 1] = null;
                    --lengthCategories;
                    System.out.println("Đã xóa danh mục có mã là " + deleteNum);
                } else {
                    System.err.println("Không thể xóa danh mục vì nó chứa sản phẩm.");
                }
            } else {
                System.err.println("Không tìm thấy danh mục với mã là  " + deleteNum);
            }
        }
    }

    private static void updateCateInfo() {
        if (lengthCategories == 0) {
            System.err.println("Không có danh mục nào để hiển thị !");
        } else {
            System.out.println("Nhập mã danh mục muốn thực hiện cập nhật thông tin : ");
            int updateID = Integer.parseInt(scanner.nextLine());

            boolean found = false;
            for (int i = 0; i < lengthCategories; i++) {
                if (arrCategories[i].getCategoryId() == updateID) {
                    System.out.println("Chọn thông tin muốn sửa cho danh mục :");
                    arrCategories[i].editData(scanner, arrCategories, lengthCategories);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.err.printf("Mã danh mục không tồn tại !\n");
            }
        }
    }

    private static void displayCateInfo() {
        if (lengthCategories == 0) {
            System.err.println("Không có danh mục nào để hiển thị !");
        } else {
            System.out.println("========Hiển thị các danh mục hiện có========");
            for (int i = 0; i < lengthCategories; i++) {
                arrCategories[i].displayData();
            }
        }
    }

    private static void addNewCate() {
        System.out.println("Nhập số lượng danh mục muốn nhập : ");
        byte addNum = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < addNum; i++) {
            System.out.printf("Nhập thông tin danh mục %d : \n", i + 1);
            Categories categories = new Categories();
            categories.inputData(scanner, arrCategories, lengthCategories);
            arrCategories[lengthCategories++] = categories;
        }
    }
}
