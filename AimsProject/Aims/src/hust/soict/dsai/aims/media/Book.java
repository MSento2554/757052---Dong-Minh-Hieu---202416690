
package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    protected List<String> authors = new ArrayList<>();

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author '" + authorName + "' is already in the list.");
        }
    }

    public void removeAuthor(String authorName) {
        // Check if author IS in the list before removing
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author '" + authorName + "' not found.");
        }
    }

    public List getAuthors() {
        return authors;
    }

    public void setAuthors(List authors) {
        this.authors = authors;
    }
}
