package ra.model;

import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    private String productId, productName, descriptions;
    private Float importPrice, exportPrice, profit;
    private Integer quantity;

    private Boolean status;

    //Constructor

    public void Product() {
        this.profit = exportPrice - importPrice;
    }

    ;

    public void Product(String productId, String productName, String descriptions, Float importPrice, Float exportPrice, Float profit, Integer quantity, Boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = exportPrice - importPrice;
        this.quantity = quantity;
        this.status = status;
    }

    //Getter
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public Float getImportPrice() {
        return importPrice;
    }

    public Float getExportPrice() {
        return exportPrice;
    }

    public Float getProfit() {
        return profit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Boolean getStatus() {
        return status;
    }

    //Setter

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setImportPrice(Float importPrice) {
        this.importPrice = importPrice;
    }

    public void setExportPrice(Float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    //displayData()
    public void displayData() {
        System.out.println("Mã sản phẩm là: " + productId);
        System.out.println("Tên sản phẩm là: " + productName);
        System.out.println("Giá nhập vào của sản phẩm là: " + importPrice);
        System.out.println("Giá bán ra của sản phẩm là: " + exportPrice);
        System.out.println("Số lượng của sản phẩm là: " + quantity);
        System.out.println("Thông tin mô tả sản phẩm: " + descriptions);
        System.out.println("Trạng thái của sản phẩm: " + (status ? "Đang bán" : "Không bán"));
    }
    //calProfit()

    public void calProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }

    //inputData()
    public void inputData(Scanner scanner, Product[] arrProduct)
    {
        while (true)//Product ID
        {
            System.out.println("Nhập mã sản phẩm bắt đầu bằng P và có 4 ký tự");
            this.productId = scanner.nextLine().strip();
            if (!productId.startsWith("P"))
                System.out.println("Mã sản phẩm phải bắt đầu bằng chữ P");
            else if (productId.length() != 4)
                System.out.println("Mã sản phẩm phải có 4 ký tự");
            else
            {
                boolean isExist = false;
                for (Product product : arrProduct)
                {
                    if (product == null)
                        break;
                    if (product.productId.equals(this.productId))
                    {
                        System.out.println("Mã sản phẩm này dã tồn tại");
                        isExist = true;
                    }
                }
                if (isExist)
                    break;
            }
        }
        while (true)//Product name
        {
            System.out.println("Nhập tên sản phẩm, độ dài từ 5-50 ký tự");
            this.productName = scanner.nextLine();
            if (productName.length() < 5 || productName.length() > 50)
                System.out.println("Tên sản phẩm phải có dộ dài từ 5-50 ký tự");
            else break;
        }
        while (true)//Import price
        {
            System.out.println("Giá nhập của sản phẩm này là (nhập số lớn hơn 0): ");
            this.importPrice = Float.parseFloat(scanner.nextLine());
            if (importPrice <= 0)
                System.out.println("Giá nhập phải lớn hơn 0");
            else break;
        }
        while (true)//Export price
        {
            System.out.println("Giá bán ra của sản phẩm này là (lớn hơn giá nhập ít nhất 20%): ");
            this.exportPrice = Float.parseFloat(scanner.nextLine());
            if ((exportPrice - importPrice) / importPrice < 0.2)
                System.out.println("Giá bán ra phải lớn hơn ít nhất 20% so với giá nhập");
            else break;
        }
        while (true)//Quantity
        {
            System.out.println("Nhập số lượng của sản phẩm này");
            this.quantity = Integer.parseInt(scanner.nextLine());
            if (quantity <= 0)
                System.out.println("Số lượng hàng nhập phải lớn hơn 0");
            else break;
        }
        System.out.println("Nhập mô tả của sản phẩm");//Description
        this.descriptions = scanner.nextLine();
        while (true)//Status
        {
            System.out.println("Nhập trạng thái của sản phẩm (chỉ được viết true hoặc false)");
            String input = scanner.nextLine();
            if (input.equals("true") || input.equals("false"))
            {
                this.status = Boolean.parseBoolean(input);
                break;
            } else System.out.println("Vui lòng nhập đúng chữ true hoặc false");
        }
    }

}
