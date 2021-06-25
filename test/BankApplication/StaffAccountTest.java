package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffAccountTest {
    private StaffAccount myStaff;
    @BeforeEach
    public void SetUp(){myStaff = new StaffAccount("James", "Bond", 2222);}

    @Test
    public void testThatStaffCanLogin(){

        assertEquals("James Bond", myStaff.getFullName());
    }

    @Test
    public void testThatStaffCanInputPin(){
        myStaff.setPin(2222);
        assertEquals(2222, myStaff.getPin());
    }

//    @Test
//    public void testThatStaffHasAName(){
//        myStaff = new StaffAccount();
////        myStaff.setStaffName("James", "Bond");
//        assertEquals("James","Bond", myStaff.getStaffName());
//    }


}

