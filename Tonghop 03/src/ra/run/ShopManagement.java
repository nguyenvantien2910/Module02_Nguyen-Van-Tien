package ra.run;

import ra.entity.Categories;
import ra.entity.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ShopManagement {
    Categories[] arrCategories = new Categories[100];
    Product[] arrProducts = new Product[100];
    int indexCategories = 0;
    int indexProduct = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopManagement shopManagement = new ShopManagement();
        do {
            System.out.println("************SHOP MENU************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    shopManagement.displayCategoriesMenu(scanner, shopManagement);
                    break;
                case 2:
                    shopManagement.displayProductsMenu(scanner, shopManagement);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        } while (true);
    }

    private void displayProductsMenu(Scanner scanner, ShopManagement shopManagement) {
        boolean isExit = true;
        do {
            System.out.println("*************PRODUCTS MENU************");
            System.out.println("1. Nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm các sản phẩm trong khoảng giá a - b(a, b nhập từ bàn phím) ");
            System.out.println("8. Thoát ");

            System.out.println("Lựa chọn của bạn :");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    shopManagement.inputListProducts(scanner, arrProducts, indexProduct);
                    break;
                case 2:
                    shopManagement.displayListProducts(arrProducts, indexProduct);
                    break;
                case 3:
                    shopManagement.sortedListProductsByPrice(arrProducts, indexProduct);
                    break;
                case 4:
                    shopManagement.updateProductById(scanner,arrProducts, indexProduct);
                    break;
                case 5:
                    shopManagement.deleteProductById(indexProduct,scanner);
                    break;
                case 6:
                    shopManagement.searchProductByName(arrProducts, indexProduct,scanner);
                    break;
                case 7:
                    shopManagement.searchProductByRangePrice(arrProducts, indexProduct,scanner);
                    break;
                case 8:
                    isExit = false;
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng nhập lại từ 1 đến 8");
            }

        } while (isExit);
    }

    private void searchProductByRangePrice(Product[] arrProducts, int indexProduct, Scanner scanner) {
        if (indexProduct == 0) {
            System.err.println("Không có sản phẩm nào!");
        } else {
            System.out.println("Mời bạn nhập giá trị nhỏ nhất : ");
            double minPrice = Double.parseDouble(scanner.nextLine());

            System.out.println("Mời bạn nhập giá trị lớn nhất : ");
            double maxPrice = Double.parseDouble(scanner.nextLine());

            System.out.printf("DANH SÁCH CÁC SẢN PHẨM CÓ GIÁ TRONG KHOẢNG %2f ĐẾN %2f\n", minPrice,maxPrice);

            for (int i = 0; i < indexProduct; i++) {
                if (arrProducts[i].getPrice() >= minPrice && arrProducts[i].getPrice() <= maxPrice) {
                    arrProducts[i].displayData(arrCategories,indexProduct);
                }
            }
        }
    }

    private void searchProductByName(Product[] arrProducts, int indexProduct, Scanner scanner) {
        if (indexProduct == 0) {
            System.err.println("Không có sản phẩm nào!");
        } else {
            System.out.println("Nhập tên sản phẩm muốn tìm kiếm : ");

            String searchName = scanner.nextLine();
            boolean isExits = false;

            for (int i = 0; i < indexProduct; i++) {
                if (arrProducts[i].getProductName().contains(searchName)) {
                    arrProducts[i].displayData(arrCategories,indexCategories);
                    isExits = true;
                }
            }

            if (!isExits) {
                System.err.println("Không tồn tại sản phẩm nào có tên như từ khóa đã nhập !");
            }
        }
    }

    private void deleteProductById(int indexProduct, Scanner scanner) {
        if (indexProduct == 0) {
            System.err.println("Không có sản phẩm nào!");
        } else {
            System.out.println("Nhập mã sản phẩm muốn thực hiện xóa :");
            String deleteID = scanner.nextLine();
            int deleteIndex = getIndexProductById(deleteID);

            if (deleteIndex >= 0) {
                for (int i = deleteIndex + 1; i < indexProduct; i++) {
                    arrProducts[i -1] = arrProducts[i];
                    arrProducts[indexProduct -1] = null;
                    indexProduct--;
                    System.out.printf("Xóa thành công sản phẩm có mã là : %s", deleteID);
                }
            } else {
                System.err.println("Mã sản phẩm không tồn tại, mời nhập lại !");
            }
        }
    }

    public int getIndexProductById(String productId) {
        for (int i = 0; i < indexProduct; i++) {
            if (arrProducts[i].getProductId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }

    private void updateProductById(Scanner scanner, Product[] arrProducts, int indexProduct) {
        if (indexProduct == 0) {
            System.err.println("Không có sản phẩm nào!");
        } else {
            System.out.println("Nhập mã sản phẩm muốn thực hiện cập nhật thông tin : ");
            String updateId = scanner.nextLine();

            int updateIndex = getIndexProductById(updateId);

            if (updateIndex >= 0) {
                boolean isExit = true;
                do {
                    System.out.println("Nhập trường thông tin muốn cập nhật : ");
                    System.out.println("1. Cập nhật tên sản phẩm ");
                    System.out.println("2. Cập nhật giá sản phẩm ");
                    System.out.println("3. Cập nhật mô tả sản phẩm ");
                    System.out.println("4. Cập nhật ngày nhập sản phẩm ");
                    System.out.println("5. Cập nhật mã danh mục của sản phẩm ");
                    System.out.println("6. Cập nhật trạng thái sản phẩm ");
                    System.out.println("7. Thoát ");

                    System.out.print("Lựa chọn của bạn : ");

                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            do {
                                System.out.println("Nhập tên mới cho sản phẩm : ");
                                String productName = scanner.nextLine();
                                if (productName.length() >= 10 && productName.length() <= 50) {
                                    boolean isExist = false;
                                    for (int i = 0; i < indexProduct; i++) {
                                        if (arrProducts[i].getProductName().equals(productName)) {
                                            isExist = true;
                                            break;
                                        }
                                    }
                                    if (isExist) {
                                        System.err.println("Tên sản phẩm đã tồn tại, vui lòng nhập lại");
                                    } else {
                                        arrProducts[updateIndex].setProductName(productName);
                                    }
                                } else {
                                    System.err.println("Tên sản phẩm có từ 10-50 ký tự, vui lòng nhập lại");
                                }
                            } while (true);
                            //break;
                        case 2:
                            System.out.println("Nhập vào giá sản phẩm:");
                            do {
                                float price = Float.parseFloat(scanner.nextLine());
                                if (price > 0) {
                                    arrProducts[updateIndex].setPrice(price);
                                } else {
                                    System.err.println("Giá sản phẩm phải lớn hơn 0, vui lòng nhập lại");
                                }
                            } while (true);
                            //break;
                        case 3:
                            System.out.println("Nhập vào mô tả sản phẩm:");
                            arrProducts[updateIndex].setDescription(scanner.nextLine());
                            break;
                        case 4:
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            System.out.println("Nhập vào ngày nhập sản phẩm:");
                            do {
                                String created = scanner.nextLine();
                                try {
                                    Date returnCreated = sdf.parse(created);
                                    arrProducts[updateIndex].setCreated(returnCreated);
                                } catch (ParseException e) {
                                    System.err.println("Định dạng ngày nhập không đúng, vui lòng nhập lại");
                                } catch (Exception ex) {
                                    System.err.println("Có lỗi trong quá trình xử lý, vui lòng nhập lại");
                                }

                            } while (true);
                            //break;
                        case 5:
                            System.out.println("Chọn danh mục của sản phẩm:");
                            for (int i = 0; i < indexCategories; i++) {
                                if (arrCategories[i].isCatalogStatus()) {
                                    System.out.printf("%d.%s\n", i + 1, arrCategories[i].getCatalogName());
                                }
                            }
                            System.out.print("Lựa chọn của bạn: ");
                            int select = Integer.parseInt(scanner.nextLine());
                            arrProducts[updateIndex].setCatalogId(arrCategories[select - 1].getCatalogId());
                            break;
                        case 6:
                            System.out.println("Nhập vào trạng thái sản phẩm:");
                            do {
                                int status = Integer.parseInt(scanner.nextLine());
                                if (status == 0 || status == 1 || status == 2) {
                                    arrProducts[updateIndex].setProductStatus(status);
                                } else {
                                    System.err.println("Trạng thái chỉ nhận giá trị 0,1,2, vui lòng nhập lại");
                                }
                            } while (true);
                            //break;
                        case 7:
                            isExit = false;
                            break;
                        default:
                            System.err.println("Lựa chọn không hợp lệ, nhập lại từ 1 ~ 7");
                    }

                } while (isExit);
            } else {
                System.err.println("Mã sản phẩm không tồn tại, mời nhập lại !");
            }

        }
    }

    private void sortedListProductsByPrice(Product[] arrProducts, int indexProduct) {
        if (indexProduct == 0) {
            System.err.println("Không có sản phẩm nào!");
        } else {
            for (int i = 0; i < indexProduct - 1; i++) {
                for (int j = i + 1; j < indexProduct; j++) {
                    if (arrProducts[i].getPrice() < arrProducts[j].getPrice()) {
                        Product temp = arrProducts[i];
                        arrProducts[i] = arrProducts[j];
                        arrProducts[j] = temp;
                    }
                }
            }

            System.out.println("Danh sách các sản phẩm sau khi được sắp xếp theo giá: ");
            for (int i = 0; i < indexProduct; i++) {
                arrProducts[i].displayData(arrCategories, indexCategories);
            }
        }
    }

    private void displayListProducts(Product[] arrProducts, int indexProduct) {
        if (indexProduct == 0) {
            System.err.println("Không có sản phẩm nào để hiển thị!");
        } else {
            for (int i = 0; i < indexProduct; i++) {
                arrProducts[i].displayData(arrCategories, indexCategories);
            }
        }
    }

    private void inputListProducts(Scanner scanner, Product[] arrProducts, int indexProduct) {
        System.out.println("Mời bạn nhập số lượng sản phẩm muốn thêm : ");
        int addNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < addNum; i++) {
            Product product = new Product();
            product.inputData(scanner, arrProducts, indexProduct, arrCategories, indexCategories);

            arrProducts[indexProduct] = product;
            indexProduct++;
        }
    }

    public void displayCategoriesMenu(Scanner scanner, ShopManagement shopManagement) {
        boolean isExit = true;
        do {
            System.out.println("*************CATEGORIES MENU************");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin các danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    shopManagement.inputListCategories(scanner);
                    break;
                case 2:
                    shopManagement.displayListCategories();
                    break;
                case 3:
                    shopManagement.updateCategories(scanner);
                    break;
                case 4:
                    shopManagement.deleteCategories(scanner);
                    break;
                case 5:
                    shopManagement.updateCategorieStatus(scanner);
                    break;
                case 6:
                    isExit = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }
        } while (isExit);
    }

    public void inputListCategories(Scanner scanner) {
        System.out.println("Nhập số danh mục cần nhập thông tin:");
        int numberOfCategories = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCategories; i++) {
            arrCategories[indexCategories] = new Categories();
            arrCategories[indexCategories].inputData(scanner, arrCategories, indexCategories);
            indexCategories++;
        }
    }

    public void displayListCategories() {
        for (int i = 0; i < indexCategories; i++) {
            arrCategories[i].displayData();
        }
    }

    public void updateCategories(Scanner scanner) {
        System.out.println("Nhập vào mã danh mục cần cập nhật:");
        int catalogId = Integer.parseInt(scanner.nextLine());
        int indexUpdate = getIndexById(catalogId);
        if (indexUpdate >= 0) {
            boolean isExit = true;
            do {
                System.out.println("1. Cập nhật tên danh mục");
                System.out.println("2. Cập nhật mô tả");
                System.out.println("3. Cập nhật trạng thái");
                System.out.println("4. Thoát");
                System.out.println("Lựa chọn của bạn:");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Mời nhập tên danh mục mới: ");
                        String catalogName;
                        do {
                            catalogName = scanner.nextLine();
                            // Check độ dài 50 kí tự
                            if (catalogName.length() <= 50) {
                                // Kiểm tra trùng lặp
                                boolean isExists = false;
                                for (int i = 0; i < indexCategories; i++) {
                                    if (arrCategories[i].getCatalogName().equals(catalogName)) {
                                        isExists = true;
                                        break;
                                    }
                                }
                                if (isExists) {
                                    System.err.println("Tên đã tồn tại, mời nhập tên khác !");
                                } else {
                                    arrCategories[indexUpdate].setCatalogName(catalogName);
                                    break;
                                }
                            } else {
                                System.err.println("Độ dài không hợp lệ, mời nhập lại ( < 50 kí tự)");
                            }
                        } while (true);
                        break;
                    case 2:
                        System.out.println("Mời nhập mô tả mới cho danh mục : ");
                        arrCategories[indexUpdate].setDescription(scanner.nextLine());
                        break;

                    case 3:
                        System.out.println("Mời nhập trạng thái mới cho danh mục : ");
                        do {
                            String status = scanner.nextLine();
                            if (status.equals("true") || status.equals("false")) {
                                arrCategories[indexUpdate].setCatalogStatus(Boolean.parseBoolean(status));
                                break;
                            } else {
                                System.err.println("Trạng thái danh mục chỉ nhận true hoặc false, vui lòng nhập lại");
                            }
                        } while (true);
                        break;

                    case 4:
                        isExit = false;
                        break;
                    default:
                        System.err.println("Vui lòng chọn từ 1-4");
                }
            } while (isExit);
        } else {
            System.err.println("Mã danh mục không tồn tại");
        }
    }

    public int getIndexById(int catalogId) {
        for (int i = 0; i < indexCategories; i++) {
            if (arrCategories[i].getCatalogId() == catalogId) {
                return i;
            }
        }
        return -1;
    }

    public void deleteCategories(Scanner scanner) {
        System.out.println("Nhập vào mã danh mục cần xóa:");
        int catalogId = Integer.parseInt(scanner.nextLine());
        int indexDelete = getIndexById(catalogId);
        if (indexDelete >= 0) {
            //Kiểm tra danh mục có sản phẩm chưa
            boolean isExistProduct = false;
            for (int i = 0; i < indexProduct; i++) {
                if (arrProducts[i].getCatalogId() == catalogId) {
                    isExistProduct = true;
                    break;
                }
            }
            if (isExistProduct) {
                System.err.println("Danh mục đang chứa sản phẩm, không thể xóa");
            } else {
                //Thực hiện xóa
                for (int i = indexDelete + 1; i < indexCategories; i++) {
                    arrCategories[i - 1] = arrCategories[i];
                }
                //Gán phần tử cuối là null
                arrCategories[indexCategories - 1] = null;
                //giảm chỉ số đi 1
                indexCategories--;
            }
        } else {
            System.err.println("Mã danh mục không tồn tại");
        }
    }

    public void updateCategorieStatus(Scanner scanner) {
        System.out.println("Nhập vào mã danh mục cần cập nhật trạng thái:");
        int catalogId = Integer.parseInt(scanner.nextLine());
        int indexUpdateStatus = getIndexById(catalogId);
        if (indexUpdateStatus >= 0) {
            arrCategories[indexUpdateStatus].setCatalogStatus(!arrCategories[indexUpdateStatus].isCatalogStatus());
        } else {
            System.err.println("Mã danh mục không tồn tại");
        }
    }
}