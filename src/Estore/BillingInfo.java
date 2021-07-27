package Estore;

public class BillingInfo {
    private Customer customer;
    private CardInfo cardInfo;
    private Address homeAddress;

    public BillingInfo(){
        customer = new Customer();
        cardInfo = new CardInfo();
    }

    public String getPhoneNumber(){
        return customer.getPhoneNumber();
    }
    public String getName(){
        return customer.getName();
    }

    public Address getDeliveryAddress() {
        return customer.getAddress();
    }

    public String getCardInfo() {
        return cardInfo.toString();
    }
}
