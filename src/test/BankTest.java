import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {


    @Test
    void addBranch() {
        //Given
        Bank bank = new Bank("National Australia Bank");

        //When
        boolean value1 = bank.addBranch("Adelaide"); //New Branch
        boolean value2 = bank.addBranch("Adelaide"); // Adding same Branch

        //Then
        assertTrue(value1);
        assertFalse(value2);

    }

    @Test
    void addCustomer() {

        //Given
        Bank bank = new Bank("National Australia Bank");

        //When
        bank.addBranch("Adelaide");
        boolean value1 = bank.addCustomer("Adelaide", "Tim", 50.05); //True as Adelaide branch exists
        boolean value2 = bank.addCustomer("Adelaide", "Mike", 175.34); //True as Adelaide branch exists
        boolean value3 = bank.addCustomer("Adelaide", "Percy", 220.12); //True as Adelaide branch exists
        boolean value4 = bank.addCustomer("Sydney", "Tim", 100.5); // False as Sydney is not in branch


        //Then
        assertTrue(value1);
        assertTrue(value2);
        assertTrue(value3);
        assertFalse(value4);


    }

    @Test
    void addCustomerTransaction() {

        //Given
        Bank bank = new Bank("National Australia Bank");

        //When
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);


        boolean value1 = bank.addCustomerTransaction("Adelaide", "Tim", 44.22); // True as Tim is a already customer of the bank/branch
        boolean value2 = bank.addCustomerTransaction("Adelaide", "Tim", 12.44); // True as Tim is a already customer of the bank/branch
        boolean value3 = bank.addCustomerTransaction("Adelaide", "Mike", 1.65); // False as Mike is not memeber of the bank/branch

        //Then
        assertTrue(value1);
        assertTrue(value2);
        assertFalse(value3);

    }

    @Test
    void findBranch() {

        //Give
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Sydney");

        //When
        Branch branch = bank.findBranch("Sydney");

        //Then
        assertEquals("Sydney", branch.getName());
        assertNotEquals("Melbourne", branch.getName());

    }
}