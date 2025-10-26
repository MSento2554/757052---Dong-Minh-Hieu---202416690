package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DVD;
public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DVD dvd1 = new DVD("The Lion King", "Roger Allers", 87, 19.95f, "Animation");
        DVD dvd2 = new DVD("Star Wars", "George Lucas", 87, 24.95f, "Science Fiction");
        DVD dvd3 = new DVD("Aladdin", "John Musker", 90, 18.99f, "Animation");

        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);

       
        cart.displayCart();
        
        cart.searchById(dvd2.getId());
        
        cart.searchById(999);
        
        cart.searchByTitle("Aladdin");

        cart.searchByTitle("Frozen");
    }
}

