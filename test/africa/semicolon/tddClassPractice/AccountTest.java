package africa.semicolon.tddClassPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testThatAccountCanDepositOnce() {

        //given
        Account nomsoAccount = new Account();
        //when
        nomsoAccount.deposit(850.0);
        assertEquals(850.0, nomsoAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountCanDepositTwice() {
        //given
        Account nomsoAccount = new Account();
        //when
        nomsoAccount.deposit(850.0);
        assertEquals(850.0, nomsoAccount.getAccountBalance());
        nomsoAccount.deposit(-500.0);
        assertEquals(850.0, nomsoAccount.getAccountBalance());

    }

    @Test
    public void testThatAccountCanWithdraw(){
        //given
        Account nomsoAccount =new Account();
        //when
        nomsoAccount.withdraw(1000.0);
        assertEquals(1000.0, nomsoAccount.getAccountBalance());
        nomsoAccount.deposit(1000);
        assertEquals(2000.0, nomsoAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCanSetPin(){
        //given
        Account nomsoAccount = new Account();
        //when
        nomsoAccount.setPin(4444);
        assertEquals(4444, nomsoAccount.getpin());

    }
}