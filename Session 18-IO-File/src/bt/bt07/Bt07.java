package bt.bt07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bt07 {
    public static void main(String[] args) throws IOException {
        //Tạo data
        Product product1 = new Product(23, "Áo thun", "Đây là áo thun");
        Product product2 = new Product(13, "Quần bò thun", "Đây là áo thun333");
        Product product3 = new Product(43, "Áo cộc", "Đây là áo thun432");
        Product product4 = new Product(89, "Quần thun", "Đây là áo thun5e5ge");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        //Sử dụng ObjectInputStream để đọc từ tệp
//        writeProduct("bt07.txt",productList);
        List<Product> productList1 = readFile("bt07.txt");
        for (Product product : productList1) {
            System.out.printf("|ID: %-5d | ProductName: %-20s | Description: %-30s\n", product.productID, product.productName, product.description);
        }
    }

    //writeProduct()
    public static void writeProduct(String path, List<Product> productList) throws IOException {
        //Tạo file
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            if (!file.exists() || file.length() == 0) {
                fileOutputStream = new FileOutputStream(path);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
            } else {
                fileOutputStream = new FileOutputStream(path);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
            }

            //Lưu từng đối tượng vào file
            for (Product product : productList) {
                objectOutputStream.writeObject(product);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
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
                throw new IOException();
            }
        }

    }

    public static List<Product> readFile(String path) {
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                try {
                    Product product = (Product) objectInputStream.readObject();
                    productList.add(product);
                } catch (IOException e) {
                    break;
                }
            }
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
}
