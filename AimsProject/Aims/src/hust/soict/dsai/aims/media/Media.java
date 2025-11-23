package hust.soict.dsai.aims.media;
import java.util.Comparator;
public class Media {
protected int id;
protected String title;
protected String category;
protected float cost;
public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public Media() {super(); }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(String title) {
    if (this.title != null && title != null) {
        return this.title.equalsIgnoreCase(title.trim());
    }
    return false;
}
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || !(obj instanceof Media)) {
        return false;
    }
    Media otherMedia = (Media) obj;
    if (this.title == null) {
        return otherMedia.title == null;
    }
    return this.title.equals(otherMedia.title);
}
}
