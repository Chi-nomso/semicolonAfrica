package Chapter3Exercises;

import africa.semicolon.tddClassPractice.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest {
    @Test
    public void testThatMyAccountHasAName(){
        MyAccount nomsoAccount = new MyAccount();
        nomsoAccount.setmyAccountname("Lady Nomso");
        assertEquals("Lady Nomso", nomsoAccount.getmyAccountname());
    }

    @Test
    public void testThatMyAccountHasANumber(){
        MyAccount nomsoAccount = new MyAccount();
        nomsoAccount.setmyAccountnumber(20212021);
        assertEquals(20212021, nomsoAccount.getmyAccountnumber());
    }

    @Test
    public void testThatMyAccountHasAType(){
        MyAccount nomsoAccount = new MyAccount();
        nomsoAccount.setmyAccountType("Savings Account");
        assertEquals("Savings Account", nomsoAccount.getmyAccountType());
    }

    @Test
    public void testThatMyAccountHasABalance(){
        MyAccount nomsoAccount = new MyAccount();
        nomsoAccount.setmyAccountBalance(1500.0);
        assertEquals(1500.0, nomsoAccount.getmyAccountBalance());
    }

    @Test
    public void testThatMyAccountCanWithdrawAndAlsoWithdrawTwice(){
        MyAccount nomsoAccount = new MyAccount();
        //given
        nomsoAccount.setmyAccountBalance(1500.0);
        assertEquals(1500.0, nomsoAccount.getmyAccountBalance());
        //then
        nomsoAccount.withdraw(1000.0);
        assertEquals(500.0, nomsoAccount.getmyAccountBalance());
        nomsoAccount.withdraw(1000.0);
    }
}
