package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    // Fields
    private HashMap<String, MenuItem> menuItemsHM = new HashMap<>();
    private Date lastUpdateDate = new Date();

    // Getters
    public HashMap<String, MenuItem> getMenuItemsHM() {
        return this.menuItemsHM;
    }

    public String getLastUpdateDate() {
        return "Last Updated: " + this.lastUpdateDate;
    }

    // Setters
    void setLastUpdateDate() {
        this.lastUpdateDate = new Date();
    }

    // Instance Methods
    void addItem(MenuItem item) {
        item.setDateAdded();
        menuItemsHM.put(item.getName(), item);
        this.setLastUpdateDate();
    }

    //TODO: Check function works
    void removeItem(MenuItem item) {
        for (Map.Entry<String, MenuItem> currentItem: menuItemsHM.entrySet()) {
            if (currentItem.getValue().equals(item)) {
                menuItemsHM.remove(currentItem.getKey());
            }
        }
    }

    //TODO: Test function works
    void printItem(String itemName) {
        if (!menuItemsHM.containsKey(itemName)) {
            System.out.println("No such item on the menu.");
        } else {
            MenuItem currentItem = menuItemsHM.get(itemName);
            System.out.println("\n" + currentItem.getName());
            System.out.println(currentItem.getDescription());
            System.out.println("Price: $" + currentItem.getPrice());
        }
    }

    //TODO: Test function works
    void printMenu() {
        System.out.println("\n" + "***** FULL MENU *****");
        for (String itemName : menuItemsHM.keySet()) {
            printItem(itemName);
        }
        System.out.println("**************************");
    }

    //TODO: Test function works
    void isNewItem(String itemName) {
        Date itemDate = menuItemsHM.get(itemName).getDateAdded();

        if (this.lastUpdateDate.equals(itemDate)) {
            System.out.println(itemName + " is a new item!");
        } else {
            System.out.println(itemName + " is NOT a new item.");
        }
    }
}
