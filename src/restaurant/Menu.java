package restaurant;

import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {

        ArrayList<MenuItem> finalMenu = new ArrayList<>();

        MenuItem toastedRaviolis = new MenuItem(7.99, "Delicious toasted ravs made here in the heart of St. Louis", "appetizer");
        MenuItem spaghetti = new MenuItem(11.99, "hand rolled pasta covered in a red meat sauce", "main course");
        MenuItem cheeseCake = new MenuItem(9.99, "cheesecake. no fruit.", "dessert");

        finalMenu.add(toastedRaviolis);
        finalMenu.add(spaghetti);
        finalMenu.add(cheeseCake);

        for (MenuItem item: finalMenu) {
            System.out.println(item.getCategory() + ":" + item.getDescription() + " for the fair price of " + item.getPrice() + " Added on " + item.getDateAdded() );
        }
    }
}
