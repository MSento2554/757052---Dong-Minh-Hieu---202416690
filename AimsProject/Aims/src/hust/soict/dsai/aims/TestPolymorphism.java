package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DVD;
import hust.soict.dsai.aims.media.Media;

public class TestPolymorphism {
    public static void main(String[] args) {
        
        List<Media> mediae = new ArrayList<Media>();

        // FIXED: Arguments reordered to match DVD(title, director, length, cost, category)
        DVD dvd = new DVD("The Lion King", "Roger Allers", 87, 19.95f, "Animation");
        
        Book book = new Book();
        book.setTitle("Star Wars");
        book.setCategory("Science Fiction");
        book.setCost(9.99f);
        
        CompactDisc cd = new CompactDisc("Some Album", "Music", "Director X", 60, 15.00f, "Famous Artist");

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}