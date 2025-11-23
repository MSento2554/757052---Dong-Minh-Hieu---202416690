package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
    if (itemsInStore.contains(media)) {
        System.out.println("The media " + media.getTitle() + " is already in the store.");
        return;
    }
    itemsInStore.add(media);
    System.out.println("The media " + media.getTitle() + " has been added to the store.");
}
    public void removeMedia(Media media) {
    if (itemsInStore.contains(media)) {
        itemsInStore.remove(media);
        System.out.println("The media " + media.getTitle() + " has been removed from the store.");
    } else {
        System.out.println("The media " + media.getTitle() + " is not in the store.");
    }
}
    public void displayStore() {
    System.out.println("\n=== Items in Store ===");
    if (itemsInStore.isEmpty()) {
        System.out.println("Store is currently empty.");
        return;
    }

    for (int i = 0; i < itemsInStore.size(); i++) {
        
        System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
    }
}

public Media getMedia(int index) {
    if (index >= 0 && index < itemsInStore.size()) {
        return itemsInStore.get(index);
    }
    return null;
}

public Media searchMedia(String title) {
    for (Media m : itemsInStore) {
        if (m.getTitle().equalsIgnoreCase(title)) {
            return m;
        }
    }
    return null;
}
public int getQtyInStore() {
    return itemsInStore.size();
}}