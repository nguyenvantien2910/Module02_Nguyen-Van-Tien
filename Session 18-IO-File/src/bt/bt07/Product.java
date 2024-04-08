package bt.bt07;

import java.io.Serializable;

public class Product implements Serializable {
    int productID;
    String productName;
    String description;

    public Product() {
    }

    public Product(int productID, String productName, String description) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
    }
}
