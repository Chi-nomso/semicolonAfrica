package Chapter3Exercises;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int purchasedItemQuantity;
    private double eachItemPrice;


    public Invoice(String partNumber, String partDescription, int quantity, int price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        purchasedItemQuantity = quantity;
        if(quantity < 0){
            System.out.println("Invalid Quantity");
        }else{
            purchasedItemQuantity = quantity;
        }

        eachItemPrice = price;
        if(price < 0){
            System.out.println("Invalid Amount");
        }else{
            eachItemPrice = price;
        }
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
        if(quantity < 0){
            System.out.println("Invalid Quantity");
        }else {
            purchasedItemQuantity = quantity;
        }
    }
    public int getpurchasedItemQuantity() {
        return purchasedItemQuantity;
    }


    public void seteachItemPrice(double itemPrice) {
        if(itemPrice > 0){
            eachItemPrice = itemPrice;
        }else
            {
                System.out.println("Invalid Amount");
            }
    }
    public double geteachItemPrice() {
        return eachItemPrice;
    }


    public double getinvoiceAmount() {
        return eachItemPrice * purchasedItemQuantity;
    }
}
