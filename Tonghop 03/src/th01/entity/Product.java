package th01.entity;

import java.util.Scanner;

public class Product {
    private String productid;

    private String productName;

    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;

    private String descriptions;
    private boolean status;

    public Product() {
    }

    public Product(String productid, String productName, float importPrice, float exportPrice, float profit, int quantity, String descriptions, boolean status) {
        this.productid = productid;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void displayProduct() {
        System.out.printf("|ID: %-4s | Tên : %-50s | Quantity: %-4d\n", this.productid, this.productName, this.quantity);
        System.out.printf("|ImportPrice: %-15.2f | ExportPrice : %-15.2f |Profit: %-15.2f\n", this.importPrice, this.exportPrice, this.profit);
        System.out.printf("|Description : %-50s\n", this.descriptions);
        System.out.printf("|Status : %-10s\n", this.status ? "Đang bán" : "Không bán");
    }

    public void inputData(Scanner scanner, Product[] arrProduct, int indexProduct) {
        this.productid = inputProductID(scanner, arrProduct, indexProduct);
        this.productName = inputProductName(scanner, arrProduct, indexProduct);
        this.importPrice = inputImportPrice(scanner);
        this.exportPrice = inputExportPrice(scanner,this.importPrice);
        this.quantity = inputQuantity(scanner);
        this.descriptions = inputDescription(scanner);
        this.status = inputStatus(scanner);
    }

    public float calProfit() {
        return this.profit = this.exportPrice - this.importPrice;
    };

    private boolean inputStatus(Scanner scanner) {
        System.out.println("Mời bạn nhập trạng thái của sản phẩm (true/false):");
        String inputStatus = scanner.nextLine();

        while (!inputStatus.equals("true") && !inputStatus.equals("false")) {
            System.err.println("Giá trị nhập không hợp lệ, vui lòng nhập lại !");
            inputStatus = scanner.nextLine();
        }

        return Boolean.parseBoolean(inputStatus);
    }

    private String inputDescription(Scanner scanner) {
        System.out.println("Mời bạn nhập mô tả cho sản phẩm : ");
        return scanner.nextLine();
    }

    private int inputQuantity(Scanner scanner) {
        int inputQuantity;

        do {
            System.out.println("Mời bạn nhập số lượng của sản phẩm :");
            inputQuantity = Integer.parseInt(scanner.nextLine());

            if (inputQuantity <= 0) {
                System.err.println("Số lượng sản phẩm phải lớn hơn 0, mời nhập lại!");
            }
        } while (inputQuantity <= 0);

        return inputQuantity;
    }

    private float inputExportPrice(Scanner scanner, float importPrice) {
        float inputExportPrice;

        do {
            System.out.println("Mời nhập giá xuất cho sản phẩm :");
            inputExportPrice = Float.parseFloat(scanner.nextLine());

            if (inputExportPrice < importPrice * 1.2) {
                System.err.println("Giá xuất phải lớn hơn ít nhất 20% so với giá nhập !");
            }
        } while (inputExportPrice < importPrice * 1.2);

        return inputExportPrice;
    }

    private float inputImportPrice(Scanner scanner) {
        float inputImportPrice;

        do {
            System.out.println("Nhập giá nhập cho sản phẩm :");
            inputImportPrice = Float.parseFloat(scanner.nextLine());

            if (inputImportPrice <= 0) {
                System.err.println("Giá nhập phải lớn hơn 0, mời nhập lại !");
            }
        } while (inputImportPrice <= 0);

        return inputImportPrice;
    }

    private String inputProductName(Scanner scanner, Product[] arrProduct, int indexProduct) {
        String inputName;

        do {
            System.out.println("Mời bạn nhập tên cho sản phẩm :");
            inputName = scanner.nextLine();

            if (inputName.length() < 6 || inputName.length() > 50) {
                System.err.println("Tên nhập có độ dài không hợp lệ (6-50 kí tự), mời nhập lại!");
                continue; // Continue to next iteration to re-prompt for input
            }

            boolean isNameExists = false;
            for (int i = 0; i < indexProduct; i++) {
                if (arrProduct[i].getProductName().equals(inputName)) {
                    System.err.println("Tên đã tồn tại, vui lòng nhập lại!");
                    isNameExists = true;
                    break;
                }
            }

            if (!isNameExists) {
                break;
            }
        } while (true);

        return inputName;
    }


    private String inputProductID(Scanner scanner, Product[] arrProduct, int indexProduct) {
        boolean isCheckDone;
        String inputID;

        do {
            isCheckDone = true;
            System.out.println("Mời bạn nhập vào mã sản phẩm ");
            inputID = scanner.nextLine();
            final String ID_REGEX = "^P\\d{3}$";

            if (!inputID.matches(ID_REGEX)) {
                System.err.println("Mã nhập không đúng định dạng (Mã sản phẩm gồm 4 ký tự, bắt đầu là ký tự P)");
                isCheckDone = false;
            } else {
                for (int i = 0; i < indexProduct; i++) {
                    if (arrProduct[i].getProductid().equals(inputID)) {
                        System.err.println("Mã đã tồn tại, mời nhập lại");
                        isCheckDone = false;
                        break;
                    }
                }
            }
        } while (!isCheckDone);

        return inputID;
    }

}

