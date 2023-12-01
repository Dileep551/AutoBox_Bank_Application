import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void addTransactions() {

        //Given
        Customer customer = new Customer("Tim", 100.0);

        //When
        customer.addTransactions(50.0);

        //Then
        ArrayList<Double> transactions = customer.getTransactions();
        assertNotNull(transactions);
        assertEquals(2, transactions.size());
        assertEquals(100.0, transactions.get(0));
    }
}