package snackbar;
import java.text.DecimalFormat;

public class Snack {
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    // fields
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    private String vendingMachineName;

    // constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId, String vendingMachineName) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
        this.vendingMachineName = vendingMachineName;
    }

    // getters and setters
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }
    public int getVendingMachineId() {
        return vendingMachineId;
    }
    public int getQuantity() {
        return quantity;
    }

    // methods
    public void addQuantity(int amount) {
        this.quantity += amount;
    }
    public void buySnack(int amount) {
        this.quantity -= amount;
    }
    public double getTotalCost(int quantity) {
        return quantity * cost;
    }
    
    @Override
    public String toString() {
        return "Snack: " + name +
                " Vending Machine: " + vendingMachineName +
                " Quantity: " + quantity + " Total Cost: " + df.format(quantity*cost);
    }
}
