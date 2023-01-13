package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Menu {
    // Fields
    private HashMap<String, MenuItem> menuItemsHM = new HashMap<>();
    private Date lastUpdateDate = new Date();

    // Getters
    public HashMap<String, MenuItem> getMenuItemsHM() {
        return this.menuItemsHM;
    }

    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
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
}
