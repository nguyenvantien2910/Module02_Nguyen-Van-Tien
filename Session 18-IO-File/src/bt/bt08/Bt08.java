package bt.bt08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bt08 {
    public static Scanner scanner = new Scanner(System.in);
    public static byte choice;

    public static void main(String[] args) throws FileNotFoundException {
        //Tạo file
        File file = new File("./src/bt/bt08/bt08.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (FileNotFoundException e) {
                throw new FileNotFoundException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        List<Product> productList = new ArrayList<>();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("================MENU===========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Tìm kiếm sản phẩm");
            System.out.println("3. Hiển thị thông tin sản phẩm");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn : ");
            choice = Byte.parseByte(scanner.nextLine());

            switch (choice) {
                case 1:
                    addNewProduct(file, productList, scanner);
                    break;
                case 2:
                    searchProduct(scanner, file);
                    break;
                case 3:
                    displayAllData(file);
                    break;
                case 4:
                    isExit = true;
                    break;

                default:
                    System.err.println("Lựa chọn không hợp lệ, mời nhập lại !");
            }
        }
    }

    private static void displayAllData(File file) {
        List<Product> productList = getProductList(file);
        System.out.println("Danh sách các sản phẩm :");
        productList.forEach(System.out::println);
    }

    private static void searchProduct(Scanner scanner, File file) {
        int productIndex = -1;
        List<Product> productList = getProductList(file);

        System.out.println("Nhập vào mã sản phẩm muốn tìm kiếm : ");
        Integer searchID = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductID() == searchID) {
                productIndex = i;
                break;
            }
        }

        if (productIndex != -1) {
            productList.get(productIndex).toString();
        } else {
            System.err.println("ID không tồn tại !");
        }

    }

    private static void addNewProduct(File file, List<Product> productList, Scanner scanner) {
        System.out.println("Nhập số lượng sản phẩm muốn thêm : ");
        byte addNum = Byte.parseByte(scanner.nextLine());

        for (int i = 0; i < addNum; i++) {
            Product product = new Product();
            System.out.printf("Nhập thông tin cho sản phẩm thứ %d :\n", i + 1);
            product.inputData(scanner);
            productList.add(product);
        }
        updateFile(file, productList);
        System.out.println("Thêm mới thành công !");
    }


    private static List<Product> getProductList(File file) {
        List<Product> productList = new ArrayList<>();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return productList;
    }

    private static void updateFile(File file, List<Product> productList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
