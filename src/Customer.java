import java.util.ArrayList;

public class Customer {

    private String name;

    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransactions) {
        this.name = name;
        this.transactions = new
                ArrayList<>();
        transactions.add(initialTransactions);
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


    public void addTransactions(double transaction) {
        transactions.add(transaction);

    }
}
