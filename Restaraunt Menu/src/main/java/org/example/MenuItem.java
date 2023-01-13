package org.example;

import java.util.Date;

public class MenuItem {
    // Field
    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean newStatus = true;
    private Date dateAdded = null;

    // Constructor
    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getNewStatus() {
        return newStatus;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNewStatus(Boolean newStatus) {
        this.newStatus = newStatus;
    }

    public void setDateAdded() {
        this.dateAdded = new Date();
    }
}
