import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {

        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transactions) {

        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            existingCustomer.addTransactions(transactions);
            return true;
        }


        return false;
    }

    public Customer findCustomer(String customerName) {

        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }


}
