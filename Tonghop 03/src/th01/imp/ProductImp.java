package th01.imp;

import th01.entity.Product;
import java.util.Arrays;
import java.util.Scanner;
public class ProductImp {
    public static void main(String[] args) {
        Product[] arrProduct = new Product[100];
        int indexProduct = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            byte select;

            System.out.println("***********************MENU************************** ");
            System.out.println("1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các  sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá ");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm ");
            System.out.println("7. Nhập sản phẩm ");
            System.out.println("8. Bán sản phẩm ");
            System.out.println("9. Cập nhật trạng thái sản phẩm ");
            System.out.println("10. Thoát");

            System.out.print("Nhập lựa chọn : ");

            select = Byte.parseByte(scanner.nextLine());

            switch (select) {
                case 1:
                    addNewProducts(scanner, arrProduct, indexProduct);
                    break;
                case 2:
                    displayProductInfo(arrProduct, indexProduct);
                    break;
                case 3:
                    calProfitOfAllProduct(arrProduct, indexProduct);
                    break;
                case 4:
                    sortProductByProfitDESC(arrProduct, indexProduct);
                    break;
                case 5:
                    countProductByPriceRange(arrProduct, indexProduct, scanner);
                    break;
                case 6:
                    findProductByName(scanner, arrProduct, indexProduct);
                    break;
                case 7:
                    importProduct(scanner, arrProduct, indexProduct);
                    break;
                case 8:
                    exportProduct(scanner, arrProduct, indexProduct);
                    break;
                case 9:
                    updateProductStatus(scanner, arrProduct, indexProduct);
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không hợp lệ, nhập từ 1-10");
            }
        }
    }

    private static void updateProductStatus(Scanner scanner, Product[] arrProduct, int indexProduct) {
        if (indexProduct == 0) {
            boolean isUpdateStatusDone = false;
            do {
                System.out.println("Nhập mã sản phẩm cần cập nhật trạng thái : ");
                String inputProductId = scanner.nextLine();

                for (int i = 0; i < indexProduct; i++) {
                    if (arrProduct[i].getProductid().equals(inputProductId)) {
                        arrProduct[i].setStatus(!arrProduct[i].isStatus());
                        System.out.printf("Đã cập nhật trạng thái thành công cho sản phẩm có mã là %s\n", inputProductId);
                        isUpdateStatusDone = true;
                        break;
                    }
                }

                if (!isUpdateStatusDone) {
                    System.err.println("Mã sản phẩm không tồn tại, mời nhập lại !");
                }

            } while (!isUpdateStatusDone);
        } else {
            System.err.println("Danh sách sản phẩm đang trống !");
        }
    }


    private static void exportProduct(Scanner scanner, Product[] arrProduct, int indexProduct) {
        if (indexProduct != 0) {
            do {
                System.out.println("Nhập vào tên sản phẩm muốn bán : ");
                String inputProductName = scanner.nextLine();
                int exportQuantity;
                boolean setQuantityDone = false;

                do {
                    System.out.println("Nhập vào số lượng sản phẩm muốn bán : ");
                    exportQuantity = Integer.parseInt(scanner.nextLine());
                    if (exportQuantity < 0) {
                        System.err.println("Số lượng nhập phải lớn hơn 0 !");
                    } else {
                        for (int i = 0; i < indexProduct; i++) {
                            if (arrProduct[i].getProductName().equals(inputProductName)) {
                                int newQuantity = arrProduct[i].getQuantity() - exportQuantity;
                                if (newQuantity >= 0) {
                                    arrProduct[i].setQuantity(newQuantity);
                                    setQuantityDone = true;
                                    System.out.printf("Đã bán thành công sản phẩm %s thành công với số lượng %d\n", inputProductName, exportQuantity);

                                } else {
                                    System.err.println("Số lượng sản phẩm không đủ đên bán!");
                                    break;
                                }
                            }
                        }
                    }
                } while (!setQuantityDone);

            } while (true);
        } else {
            System.err.println("Danh sách sản phẩm đang trống!");
        }
    }

    private static void importProduct(Scanner scanner, Product[] arrProduct, int indexProduct) {
        if (indexProduct != 0) {
            System.out.println("Nhập vào mã sản phẩm : ");
            String inputProductId = scanner.nextLine();
            int inputQuantity;

            do {
                System.out.println("Nhập vào số lượng sản phẩm : ");
                inputQuantity = Integer.parseInt(scanner.nextLine());
                if (inputQuantity < 0) {
                    System.err.println("Số lượng nhập phải lớn hơn 0 !");
                } else {
                    break;
                }
            } while (true);

            for (int i = 0; i < indexProduct; i++) {
                if (arrProduct[i].getProductid().equals(inputProductId)) {
                    arrProduct[i].setQuantity(arrProduct[i].getQuantity() + inputQuantity);
                }
            }
            System.out.printf("Đã nhập thành công cho sản phẩm có mã là %s\n", inputProductId);
        } else {
            System.err.println("Danh sách sản phẩm đang trống!");
        }
    }

    private static void findProductByName(Scanner scanner, Product[] arrProduct, int indexProduct) {
        if (indexProduct != 0) {
            System.out.println("Nhập tên sản phẩm muốn tìm kiếm : ");
            String searchName = scanner.nextLine();

            for (int i = 0; i < indexProduct; i++) {
                if (arrProduct[i].getProductName().contains(searchName)) {
                    arrProduct[i].displayProduct();
                } else {
                    System.err.println("Không có sản phẩm nào phù hợp với từ khóa tìm kiếm!");
                }
            }
        } else {
            System.err.println("Hiện không có sản phẩm nào !");
        }
    }

    private static void countProductByPriceRange(Product[] arrProduct, int indexProduct, Scanner scanner) {
        if (indexProduct == 0) {
            float fromPrice, toPrice;
            byte count = 0;

            do {
                System.out.println("Nhập giá nhỏ nhất (fromPrice): ");
                fromPrice = Float.parseFloat(scanner.nextLine());

                if (fromPrice > 0) {
                    break;
                } else {
                    System.err.println("Giá nhập không hợp lệ, mời nhập lại !");
                }
            } while (true);


            do {
                System.out.println("Nhập giá lớn nhất (toPrice): ");
                toPrice = Float.parseFloat(scanner.nextLine());

                if (toPrice > 0) {
                    break;
                } else {
                    System.err.println("Giá nhập không hợp lệ, mời nhập lại !");
                }
            } while (true);

            for (int i = 0; i < indexProduct; i++) {
                if (arrProduct[i].getExportPrice() >= fromPrice && arrProduct[i].getExportPrice() <= toPrice) {
                    count++;
                }
            }

            System.out.printf("Có %d sản phẩm có giá nằm trong khoảng %.2f ~ %.2f\n", count, fromPrice, toPrice);
        } else {
            System.err.println("Hiện không có sản phẩm nào !");
        }
    }


    private static void sortProductByProfitDESC(Product[] arrProduct, int indexProduct) {
        if (indexProduct != 0) {
            Arrays.sort(arrProduct, (o1, o2) -> Float.compare(o1.getProfit(), o2.getProfit()));
            System.out.println("Danh sách sắp xếp theo lợi nhuận giảm dần ");
            for (int i = 0; i < indexProduct; i++) {
                arrProduct[i].displayProduct();
            }
        } else {
            System.err.println("Hiện không có sản phẩm nào !");
        }
    }

    private static void calProfitOfAllProduct(Product[] arrProduct, int indexProduct) {
        if (indexProduct != 0 ){
            for (int i = 0; i < indexProduct; i++) {
                arrProduct[i].setProfit(arrProduct[i].calProfit());
            }
        } else {
            System.err.println("Danh sách sản phẩm đang trống !");
        }
    }

    private static void displayProductInfo(Product[] arrProduct, int indexProduct) {
        if (indexProduct != 0) {
            System.out.println("THÔNG TIN CÁC SẢN PHẨM CÁC SẢN PHẨM");
            for (int i = 0; i < indexProduct; i++) {
                arrProduct[i].displayProduct();
            }
        } else {
            System.err.println("Không có sản phẩm nào để hiển thị !");
        }
    }

    private static void addNewProducts(Scanner scanner, Product[] arrProduct, int indexProduct) {
        System.out.println("Nhập số lượng sản phẩm muốn thêm : ");
        byte addNum = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < addNum; i++) {
            Product product = new Product();
            System.out.printf("Nhâp thông tin của sản phẩm thứ %d : \n", i + 1);
            product.inputData(scanner, arrProduct, indexProduct);

            arrProduct[indexProduct] = product;
            indexProduct++;
        }
    }
}
