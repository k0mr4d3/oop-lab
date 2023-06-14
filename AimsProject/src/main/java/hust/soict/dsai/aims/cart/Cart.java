package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The disc has been added.");
        }
        else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.size() > 0) {
            itemsOrdered.remove(media);
            System.out.println("The disc has been removed.");
        }
        else {
            System.out.println("The cart is empty.");
        }
    }

    public float totalCost() {
        float totalCost = 0.0f;

        for (int i=0; i<itemsOrdered.size(); ++i) {
            totalCost += itemsOrdered.get(i).getCost();
        }

        return totalCost;
    }

    public void printOrderedItems() {
        System.out.println("********************* CART *********************");
        System.out.println("Ordered Items:");

        for (int i=0; i<itemsOrdered.size(); ++i) {
            Media a = itemsOrdered.get(i);
            System.out.printf("%d. DVD - %s - %s - %s - %s: %.2f $\n", i+1, a.getTitle(), a.getCategory(), a.getDirector(), a.getLength(), a.getCost());
        }

        System.out.printf("Total cost: %.2f\n", totalCost());
        System.out.println("************************************************");
    }

    public void searchById(int id) {
        System.out.printf("Search Results for discs with ID %d\n", id);
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            Media a = itemsOrdered.get(i);
            if (a.getId() == id) {
                System.out.printf("%d: DVD - %s - %s - %s - %s: %.2f $\n", a.getId(), a.getTitle(), a.getCategory(), a.getDirector(), a.getLength(), a.getCost());
            }
        }
    }

    public void searchByTitle(String title) {
        System.out.printf("Search Results for discs with title \"%s\"\n", title);
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            Media a = itemsOrdered.get(i);
            if (a.getTitle().equals(title)) {
                System.out.printf("%d: DVD - %s - %s - %s - %s: %.2f $\n", a.getId(), a.getTitle(), a.getCategory(), a.getDirector(), a.getLength(), a.getCost());
            }
        }
    }
}
