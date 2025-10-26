import java.util.Scanner;

public class AIMS {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Store store = new Store();
            Cart cart = new Cart();

        store.addDVD(new DVD("Movie 1", "Director A", 120, 12.99f, "Action"));
        store.addDVD(new DVD("Movie 2", "Director B", 90, 9.49f, "Comedy"));
        store.addDVD(new DVD("Movie 3", "Director C", 110, 11.99f, "Drama"));
        store.addDVD(new DVD("Movie 4", "Director D", 130, 14.59f, "Sci-Fi"));

        int choice = 0;
        while (choice != 7) {
            System.out.println("\n=== AIMS MENU ===");
            System.out.println("1. View Store");
            System.out.println("2. View Cart");
            System.out.println("3. Add DVD to Cart");
            System.out.println("4. Remove DVD from Cart");
            System.out.println("5. Search DVD in Cart by ID");
            System.out.println("6. Search DVD in Cart by Title");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-5): ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 : store.displayStore();
                case 2 : cart.displayCart();
                case 3 : {
                    store.displayStore();
                    if (store.getQtyInStore() == 0) {
                        System.out.println("No DVDs available to add.");
                        return;
                    }
                    System.out.print("Enter the number of the DVD to add: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input.");
                        sc.nextLine();
                        return;
                    }
                    int addIndex = sc.nextInt() - 1;
                    sc.nextLine();
                    DVD toAdd = store.getDVDByIndex(addIndex);
                    if (toAdd != null) {
                        cart.addDVD(toAdd);
                    } else {
                        System.out.println("Invalid DVD number.");
                    }
                }
                case 4 : {
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                        return;
                    }
                    cart.displayCart();
                    System.out.print("Enter the title of the DVD to remove: ");
                    String titleToRemove = sc.nextLine();
                    cart.removeDVD(titleToRemove);
                }
                case 5:
                        if (cart.isEmpty()) {
                            System.out.println("Your cart is empty.");
                            break;
                        }
                        System.out.print("Enter DVD ID to search: ");
                        if (sc.hasNextInt()) {
                            int id = sc.nextInt();
                            sc.nextLine();
                            cart.searchById(id);
                        } else {
                            System.out.println("Invalid input.");
                            sc.nextLine();
                        }
                        break;
                case 6:
                        if (cart.isEmpty()) {
                            System.out.println("Your cart is empty.");
                            break;
                        }
                        System.out.print("Enter DVD title to search: ");
                        String title = sc.nextLine();
                        cart.searchByTitle(title);
                        break;             

            
                case 7 : System.out.println("Exiting... Goodbye!");
                default : System.out.println("Please choose a valid option (1-7).");
            }
        }

        }
    }
}
