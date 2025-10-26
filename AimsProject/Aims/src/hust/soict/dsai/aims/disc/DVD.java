package hust.soict.dsai.aims.disc;
public class DVD {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String director;
    private int length;
    private float cost;
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public DVD(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DVD(String title, float cost, String category) {
        this(title);
        this.cost = cost;
        this.category = category;
    }

    public DVD(String title, String director, float cost, String category) {
        this(title, cost, category);
        this.director = director;
    }

    public DVD(String title, String director, int length, float cost, String category) {
        this(title, director, cost, category);
        this.length = length;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("DVD - [%s] - [%s] - [%s] - [%d]: %.2f $",
                title, category, director, length, cost);
    }

    public boolean isMatch(String title) {
        if (title == null || this.title == null) return false;
        return this.title.equalsIgnoreCase(title.trim());
    }
}
