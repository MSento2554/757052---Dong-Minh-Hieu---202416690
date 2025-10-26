package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DVD;

public class Store {
    private static final int MAX_ITEMS_IN_STORE = 50;
    private DVD[] itemsInStore = new DVD[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DVD disc) {
        if (qtyInStore >= MAX_ITEMS_IN_STORE) {
            System.out.println("Store is full. Cannot add more DVDs.");
            return;
        }
        itemsInStore[qtyInStore++] = disc;
    }

    public void displayStore() {
        if (qtyInStore == 0) {
            System.out.println("\nStore is currently empty.");
            return;
        }

        System.out.println("\n=== DVDs Available in Store ===");
        for (int i = 0; i < qtyInStore; i++) {
            DVD disc = itemsInStore[i];
            System.out.println((i + 1) + ". " + disc.getTitle() + " (" + disc.getCategory() + ") - $" + disc.getCost());
        }
    }

    public DVD getDVDByIndex(int index) {
        if (index >= 0 && index < qtyInStore) {
            return itemsInStore[index];
        }
        return null;
    }

    public int getQtyInStore() {
        return qtyInStore;
    }
}
