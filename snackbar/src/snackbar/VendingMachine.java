package snackbar;

public class VendingMachine {
    // fields
    private static int maxId = 0;

    private int id;
    private String name;

    // constructor
    public VendingMachine(String name) {
        maxId++;
        this.id = maxId;
        this.name = name;
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
}
