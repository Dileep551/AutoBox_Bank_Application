import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchTest {

    @Test
    void getName() {

        //Given
        Branch branch = new Branch("Adelaide");

        //Then
        assertEquals("Adelaide", branch.getName());
        assertNotEquals("Sydney", branch.getName());

    }


    @Test
    void newCustomer() {

        //Given
        Branch branch = new Branch("Adelaide");


        //When
        boolean isNewCustomer1 = branch.newCustomer("Tim", 72.00); // As Branch has no customers need to be True
        boolean isNewCustomer2 = branch.newCustomer("Tim", 172.00); // As it's duplicate need to be false

        //Then
        assertTrue(isNewCustomer1);
        assertFalse(isNewCustomer2);


    }

    @Test
    void addCustomerTransaction() {
        //Given
        Branch branch = new Branch("Adelaide");
        branch.newCustomer("Tim", 72.00);

        //When
        boolean isCustomerTransaction1 = branch.addCustomerTransaction("Tim", 155); // Tim is customer of branch has transactions.
        boolean isCustomerTransaction2 = branch.addCustomerTransaction("Sam", 155); //Sam is not customer will be false

        //Then
        assertTrue(isCustomerTransaction1);
        assertFalse(isCustomerTransaction2);


    }

    @Test
    void findCustomer() {

        //Given
        Branch branch = new Branch("Adelaide");
        branch.newCustomer("Tim", 72.00);

        //When
        Customer customer1 = branch.findCustomer("Tim");
        Customer customer2 = branch.findCustomer("Sam"); // Not a customer return null

        //Then
        assertEquals("Tim", customer1.getName());
        assertNull(customer2);


    }
}