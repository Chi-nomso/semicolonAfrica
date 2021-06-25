package BankApplication;

import africa.semicolon.tddClassPractice.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    private Customer myCustomer;
    @BeforeEach
    public void setUp(){myCustomer = new Customer();}

    @Test
    public void testForCustomerFirstName(){
        myCustomer.setFirstName("Grace");
        assertEquals("Grace", myCustomer.getFirstName());
    }

    @Test
    public void testForCustomerLastName(){
        myCustomer.setLastName("Amara");
        assertEquals("Amara", myCustomer.getLastName());
    }

    @Test
    public void testThatCustomerCanSetPin(){
        myCustomer.setPin(1212);
        assertEquals(1212, myCustomer.getPin());
    }

    @Test
    public void testThatCustomerHasPhoneNumber(){
        myCustomer.setPhoneNumber("08123456778");
        assertEquals("08123456778", myCustomer.getPhoneNumber());
    }

    @Test
    public void testThatCustomerCanDeposit(){
        myCustomer.deposit(5000);
        assertEquals(5000,myCustomer.getAccountBalance());
    }

    @Test
    public void testThatCustomerCanWithdraw(){
        //given
        myCustomer.deposit(5000);
        assertEquals(5000,myCustomer.getAccountBalance());
        //then
        myCustomer.Withdraw(1000);
        assertEquals(4000, myCustomer.getAccountBalance());
    }

    @Test
    public void testThatCustomerCanTransfer(){
        //given
        myCustomer.deposit(5000);
        //assertEquals(5000,myCustomer.getAccountBalance());
        Account NomsoAccount = new Account();
        myCustomer.transfer(NomsoAccount, 2000);
        assertEquals(3000,myCustomer.getAccountBalance());
    }

    @Test
    public void testThatCustomerHasAccountNumber(){
        Customer customerOne = new Customer();
        Customer customerTwo = new Customer();
        assertEquals(1,customerOne.getAccountNumber());
        //assertEquals(2,customerTwo.getAccountNumber());
    }
}