package BankPHP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankPHPTest {
    User chinomso;
    User kelvin;
    BankDB bankDataBase;

    @BeforeEach
    public void setUp() {
        chinomso = new User("Nomso", "Brown", "nomso@gmail.com", "0800086464");
        kelvin = new User("Kelvin","White","kelvin@gmail.com","080980980");
        bankDataBase = new BankDB();

        bankDataBase.addUser(chinomso);
        bankDataBase.addUser(kelvin);
    }


    @Test
    void userIsCreatedAfterInitialization(){
        assertNotNull(chinomso);
        assertEquals(chinomso.getFirstName(), "Nomso");
    }

    @Test
    void accountIsCreatedWhenUserIsCreatedTest(){
        assertFalse(chinomso.getAccounts().isEmpty());
        assertEquals(chinomso.getAccounts().get(0).getAccountName(), "Nomso");
    }

   @Test
    void accountNumberIsCreatedWhenAccountIsCreated(){
        Account account = chinomso.getAccounts().get(0);
        assertNotNull(account.getAccountNumber());
       assertEquals(account.getAccountNumber().length(), 10);
       System.out.println(account.getAccountNumber());
   }

   @Test
    void DifferentAccountsHaveDifferentAccountNumbers(){
        Account kel = kelvin.getAccounts().get(0);
       Account chi = chinomso.getAccounts().get(0);
        assertNotEquals(kel.getAccountNumber(), chi.getAccountNumber());
   }

   @Test
    void userCanSetPinAfterCreatingAccount(){
       Account account = chinomso.getAccounts().get(0);
        account.setPin("2323");
        assertEquals(account.getPin(), "2323");
   }

   @Test
   void userAccountBalanceIsZeroWhenAccountIsCreated(){
       Account account = chinomso.getAccounts().get(0);
        assertEquals(account.getBalance(), 0.0);
   }

   @Test
    void userCanDepositToUserAccount(){
       Account account = chinomso.getAccounts().get(0);
       account.deposit(5000);
       assertEquals(account.getBalance(), 5000);
   }

   @Test
    void userCanNotDepositNegativeAmount(){
        Account account = chinomso.getAccounts().get(0);
        account.deposit(-1000);
        assertEquals(account.getBalance(), 0.0);
    }

    @Test
    void userCanWithdraw(){
        //given
        Account account = chinomso.getAccounts().get(0);
        account.deposit(5000);
        assertEquals(account.getBalance(), 5000);
        //then
        account.withdraw(1000);
        assertEquals(account.getBalance(), 4000);
    }

    @Test
    void userCannotWithdrawNegativeAmount(){
        Account account = chinomso.getAccounts().get(0);
        account.withdraw(-2000);
        assertEquals(account.getBalance(), 0.0);
    }

    @Test
    void userCanTransfer(){
        //given
        Account account = chinomso.getAccounts().get(0);
        account.deposit(5000);
        assertEquals(account.getBalance(), 5000);
        //when
        account.transfer(kelvin.getAccounts().get(0).getAccountNumber(), 2000);
        assertEquals(account.getBalance(),3000);
        assertEquals(kelvin.getAccounts().get(0).getBalance(), 2000);
    }
}
