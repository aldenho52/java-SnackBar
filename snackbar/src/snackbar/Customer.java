package snackbar;

public class Customer {
    // fields
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

        // constructor
    public Customer(String name, double cashOnHand) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // methods
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addCashToCashOnHand(double cash) {
        this.cashOnHand += cash;
    }
    public double getCashOnHand() {
        return cashOnHand;
    }
    public void buySnack(double cost) {
        this.cashOnHand -= cost;
    }
}
