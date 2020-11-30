package snackbar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

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
    public void addQuantity(int amount) {
        this.quantity += amount;
    }
    public void buySnack(int amount) {
        this.quantity -= amount;
    }
    public double getTotalCost(int quantity) {
        return quantity * cost;
    }
    
}
