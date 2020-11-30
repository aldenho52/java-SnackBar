package snackbar;

public class Main {
    public static void main(String[] args) {
        // objects
        Customer jane = new Customer("Jane", 37.75);
        Customer bob = new Customer("Bob", 28.14);

        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine food = new VendingMachine("Food");

        Snack soda = new Snack("Soda", 21, 2.00, drink.getId());
        Snack pretzel = new Snack("Pretzel", 29, 1.00, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 35, 2.00, food.getId());

        // MVP
        System.out.println(jane.getName() + " cash on hand " + jane.getCashOnHand());
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

        System.out.println();
        jane.buySnack(2.00);
        System.out.println(jane.getName() + " cash on hand " + jane.getCashOnHand());
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

        System.out.println();
        System.out.println(bob.getName() + " cash on hand " + bob.getCashOnHand());
        soda.buySnack(2);
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

        System.out.println();
        jane.addCashToCashOnHand(10);
        System.out.println(jane.getName() + " cash on hand " + jane.getCashOnHand());

        System.out.println();
        jane.buySnack(1.00);
        System.out.println(jane.getName() + " cash on hand " + jane.getCashOnHand());
        System.out.println("Quantity of " + chocolateBar.getName() + " is " + chocolateBar.getQuantity());

        System.out.println();
        pretzel.addQuantity(12);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

        System.out.println();
        bob.buySnack(6.00);
        System.out.println(bob.getName() + " cash on hand " + bob.getCashOnHand());
        pretzel.buySnack(3);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

    }
}