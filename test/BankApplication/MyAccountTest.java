package BankApplication;

import africa.semicolon.tddClassPractice.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyAccountTest {
    private MyAccount myMyAccount;
    @BeforeEach
    public void setUp(){
        int accountNumber = 22334455;
        myMyAccount = new MyAccount(accountNumber);}


    @Test
    public void testThatAccountHasAFirstName(){
        myMyAccount.setFirstName("ChiNomso");
        assertEquals("ChiNomso", myMyAccount.getFirstName());
    }

    @Test
    public void testThatAccountHasLastName(){
        myMyAccount.setLastName("Noble");
        assertEquals("Noble", myMyAccount.getLastName());
    }

    @Test
    public void testAccountAcceptsDeposit(){
        myMyAccount.deposit(5000.00);
        assertEquals(5000.00, myMyAccount.getDeposit());
        assertEquals(5000.00, myMyAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountAllowsWithdrawal(){
        //given
        myMyAccount.deposit(5000.00);
        assertEquals(5000.00, myMyAccount.getDeposit());
        assertEquals(5000.00, myMyAccount.getAccountBalance());
        //then
        myMyAccount.withdraw(1000.00);
        assertEquals(4000, myMyAccount.getAccountBalance());
    }

    @Test
    public void testThatThatAccountHasANumber(){
        assertEquals(22334455, myMyAccount.getAccountNumber());
    }

    //@Test
//    public void testThatAccountCanGenerateAccountNumber(){
//        Account yourAccount = new Account();
//        int acctNumber1 = myMyAccount.getAccountNumber();
//        int acctNumber2 = yourAccount.getNewAccountNumber();
//        assertEquals(1,acctNumber1);
//        assertEquals(2,acctNumber2);
//    }
}
