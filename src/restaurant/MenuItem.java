package restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(double price, String description, String category){
        this.category = category;
        this.description = description;
        this.price = price;
        this.dateAdded = new Date();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
