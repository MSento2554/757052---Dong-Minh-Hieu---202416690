package hust.soict.dsai.aims.media;
public class DVD extends Disc{
        private static int nbDigitalVideoDiscs = 0;
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