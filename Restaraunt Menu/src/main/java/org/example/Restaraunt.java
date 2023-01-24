package org.example;

public class Restaraunt {
    public static void main(String[] args) {
        // Test Menu
        Menu testMenu = new Menu();

        // Menu Items
        MenuItem burger = new MenuItem("Burger", 10.00, "This is... a tasty burger!", "Main Course");
        MenuItem fries = new MenuItem("Fries", 5.00, "You bite the fries, the fries bite back!", "Appetizer");
        MenuItem iceCream = new MenuItem("Ice Cream", 3.00, "Creamed ice", "Dessert");

        // Menu Test Log
        System.out.println(testMenu.getLastUpdateDate());
        System.out.println(testMenu.getMenuItemsHM());

        // Item Test Logs
        System.out.println(burger.getNewStatus());
        System.out.println(fries.getDateAdded());
        System.out.println(iceCream.getName());

        // Add Items to Menu
        testMenu.addItem(burger);
        testMenu.addItem(fries);
        testMenu.addItem(iceCream);

        // Menu Last Update Date check
        System.out.println(testMenu.getLastUpdateDate());
        System.out.println(testMenu.getMenuItemsHM());

        // Remove Item from Menu
        testMenu.removeItem(burger);

        // Test Remove Item, Print Menu, Print Item Worked
        testMenu.printMenu();
        testMenu.printItem("Fries");

        // Test isNewItem()
        MenuItem pancakes = new MenuItem("Pancakes",5.00, "Test description.", "Main Course");
        testMenu.addItem(pancakes);
        testMenu.isNewItem("Fries");
        testMenu.isNewItem("Pancakes");

        // Test MenuItem.equals()
        MenuItem pancakes2 = new MenuItem("Pancakes",5.00, "Test description.", "Main Course");
        System.out.println(pancakes.equals(pancakes2));


    }
}
