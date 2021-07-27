package Estore;

public class Item {
    private int productQuantity;
    private Product itemProduct;


    public Item(int productQuantity, Product itemProduct) {
        this.productQuantity = productQuantity;
        this.itemProduct = itemProduct;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Product getItemProduct() {
        return itemProduct;
    }

    public void setItemProduct(Product itemProduct) {
        this.itemProduct = itemProduct;
    }
}
