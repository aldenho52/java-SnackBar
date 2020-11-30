package snackbar;

import java.text.DecimalFormat;

public class Main {
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    public static void main(String[] args) {
        // objects
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // food VM
        Snack chips = new Snack("Chips", 36, 1.75, food.getId(), "Food");
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId(), "Food");
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId(), "Food");
        // water VM
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId(), "Drink");
        Snack water = new Snack("Water", 20, 2.75, drink.getId(), "Drink");

        // MVP
        jane.buySnack(3*soda.getCost());
        soda.buySnack(3);
        System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCashOnHand()));
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

        System.out.println();
        jane.buySnack(1*pretzel.getCost());
        pretzel.buySnack(1);
        System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCashOnHand()));        
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

        System.out.println();
        bob.buySnack(2*soda.getCost());
        soda.buySnack(2);
        System.out.println(bob.getName() + " cash on hand " + df.format(bob.getCashOnHand()));
        System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

        System.out.println();
        jane.addCashToCashOnHand(10);
        System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCashOnHand())); 
        System.out.println();
        jane.buySnack(1*chocolateBar.getCost());
        chocolateBar.buySnack(1);
        System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCashOnHand()));         System.out.println("Quantity of " + chocolateBar.getName() + " is " + chocolateBar.getQuantity());

        System.out.println();
        pretzel.addQuantity(12);
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

        System.out.println();
        bob.buySnack(3*pretzel.getCost());
        pretzel.buySnack(3);
        System.out.println(bob.getName() + " cash on hand " + df.format(bob.getCashOnHand()));
        System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

        // Stretch Goals
        System.out.println("Stretch Goals");
        System.out.println();

        System.out.println(chips);
        System.out.println(chocolateBar);
        System.out.println(pretzel);
        System.out.println(soda);
        System.out.println(water);


    }
}