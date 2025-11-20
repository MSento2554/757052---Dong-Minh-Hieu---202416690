package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DVD;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DVD[] itemsOrdered = new DVD[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DVD disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full. Cannot add more DVDs.");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("Added to cart: " + disc.getTitle());
    }
    public void addDigitalVideoDisc(DVD [] dvdList) {

    }
    public void removeDVD(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equalsIgnoreCase(title)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[--qtyOrdered] = null;
                System.out.println("Removed from cart: " + title);
                return;
            }
        }
        System.out.println("DVD titled \"" + title + "\" not found in cart.");
    }

    public void displayCart() {
        if (qtyOrdered == 0) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.printf("Total cost: %.2f $%n", totalCost());
        System.out.println("***************************************************");
    }
     public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found DVD: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found DVD: " + itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: \"" + title + "\"");
        }
    }
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public boolean isEmpty() {
        return qtyOrdered == 0;
    }
}
