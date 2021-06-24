package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAppTest {
    private BankApp myBankApp;
    @BeforeEach
    public void setUp(){myBankApp = new BankApp();}


    @Test
    public void testThatAccountHasAFirstName(){
        myBankApp.setFirstName("ChiNomso");
        assertEquals("ChiNomso", myBankApp.getFirstName());
    }

    @Test
    public void testThatAccountHasLastName(){
        myBankApp.setLastName("Noble");
        assertEquals("Noble", myBankApp.getLastName());
    }

    @Test
    public void testAccountAcceptsDeposit(){
        myBankApp.deposit(5000.00);
        assertEquals(5000.00, myBankApp.getDeposit());
        assertEquals(5000.00,myBankApp.getAccountBalance());
    }

    @Test
    public void testThatAccountAllowsWithdrawal(){
        //given
        myBankApp.deposit(5000.00);
        assertEquals(5000.00, myBankApp.getDeposit());
        assertEquals(5000.00,myBankApp.getAccountBalance());
        //then
        myBankApp.withdraw(1000.00);
        assertEquals(4000,myBankApp.getAccountBalance());
    }
}
