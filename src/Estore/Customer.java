package Estore;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private Cart cart;
    private List <BillingInfo> billingInfo;

public Customer(){
    super();

}
public Customer(int age, String email, String name, String password, String phone, Address homeAddress){
    super(age,email,name,password,phone,homeAddress);
    this.billingInfo = new ArrayList<>();
    this.cart = new Cart();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(Address homeAddress) {
        super.setAddress(homeAddress);
    }
}
