package Chapter3Exercises;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int purchasedItemQuantity;
    private double eachItemPrice;


    public Invoice(String partNumber, String partDescription, int quantity, int price){

    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String invoicePartNumber) {
        partNumber = invoicePartNumber;
    }


    public void setPartDescription(String invoiceDescription) {
        partDescription = invoiceDescription;
    }
    public String getPartDescription() {
        return partDescription;
    }


    public void setpurchasedItemQuantity(int quantity) {
        purchasedItemQuantity = quantity;
    }
    public int getpurchasedItemQuantity() {
        return purchasedItemQuantity;
    }


    public void seteachItemPrice(double itemPrice) {
        eachItemPrice = itemPrice;
    }
    public double geteachItemPrice() {
        return eachItemPrice;
    }

}
