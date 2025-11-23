package hust.soict.dsai.aims;

import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DVD;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class AIMS {
    
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        store.addMedia(new DVD("Chainsaw Man: Reze", "Tatsuya Yoshihara", 87, 19.95f, "Animation"));
        store.addMedia(new DVD("Kubikiri Cycle", "NisioIsiN", 87, 24.95f, "Science Fiction"));
        store.addMedia(new CompactDisc("Blue Pop Reverberation", "Pop", "Mia", 42, 10.50f, "Michael Jackson"));
    
        store.addMedia(new Book("Monogatari", "Novel", 15.00f));


        int choice;
        do {
            showMenu();
            choice = getUserChoice();
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("\nAIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static int getUserChoice() {
        System.out.print("Enter choice: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static void viewStore() {
        store.displayStore();
        int choice;
        do {
            storeMenu();
            choice = getUserChoice();
            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCartFromStore();
                    break;
                case 3:
                    playMediaFromStore();
                    break;
                case 4:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    public static void seeMediaDetails() {
        System.out.print("Enter the title of the media: ");
        String title = sc.nextLine();
        Media media = store.searchMedia(title);

        if (media != null) {
            System.out.println(media.toString());
            int choice;
            do {
                mediaDetailsMenu();
                choice = getUserChoice();
                switch (choice) {
                    case 1:
                        cart.addMedia(media);
                        break;
                    case 2:
                        if (media instanceof Playable) {
                            ((Playable) media).play();
                        } else {
                            System.out.println("This media cannot be played.");
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 0);
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void addMediaToCartFromStore() {
        System.out.print("Enter title to add: ");
        String title = sc.nextLine();
        Media media = store.searchMedia(title);
        if (media != null) {
            cart.addMedia(media);
        } else {
            System.out.println("Media not found in store.");
        }
    }

    public static void playMediaFromStore() {
        System.out.print("Enter title to play: ");
        String title = sc.nextLine();
        Media media = store.searchMedia(title);
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media is not playable.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void updateStore() {
        System.out.println("1. Add Media to Store");
        System.out.println("2. Remove Media from Store");
        int choice = getUserChoice();
        if (choice == 1) {
            System.out.println("Enter title: ");
            String title = sc.nextLine();
            System.out.println("Enter category: ");
            String category = sc.nextLine();
            System.out.println("Enter cost: ");
            float cost = sc.nextFloat();
            sc.nextLine();
            store.addMedia(new DVD(title, category, cost)); 
        } else if (choice == 2) {
            System.out.print("Enter title to remove: ");
            String title = sc.nextLine();
            Media media = store.searchMedia(title);
            if (media != null) {
                store.removeMedia(media);
            } else {
                System.out.println("Media not found.");
            }
        }
    }

    public static void seeCurrentCart() {
        cart.displayCart();
        int choice;
        do {
            cartMenu();
            choice = getUserChoice();
            switch (choice) {
                case 1:
                    System.out.println("Filter options: 1. By ID   2. By Title");
                    int filterOption = getUserChoice();
                    if (filterOption == 1) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        cart.searchById(id);
                    } else {
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        cart.searchByTitle(title);
                    }
                    break;
                case 2:
                    System.out.println("Sort options: 1. By Title   2. By Cost");
                    int sortOption = getUserChoice();
                    if (sortOption == 1) {
                        cart.sortByTitle();
                        cart.displayCart();
                    } else {
                        cart.sortByCost();
                        cart.displayCart();
                    }
                    break;
                case 3:
                    System.out.print("Enter title to remove: ");
                    String title = sc.nextLine();
                    Media m = cart.searchForMedia(title);
                    if (m != null) {
                        cart.removeMedia(m);
                    } else {
                        System.out.println("Media not found in cart.");
                    }
                    break;
                case 4:
                    System.out.print("Enter title to play: ");
                    String playTitle = sc.nextLine();
                    Media playMedia = cart.searchForMedia(playTitle);
                    if (playMedia != null && playMedia instanceof Playable) {
                        ((Playable) playMedia).play();
                    } else {
                        System.out.println("Media not found or not playable.");
                    }
                    break;
                case 5:
                    System.out.println("Order created! Thank you for shopping.");
                    cart.emptyCart();
                    break;
                case 0:
                    System.out.println("Returning...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}