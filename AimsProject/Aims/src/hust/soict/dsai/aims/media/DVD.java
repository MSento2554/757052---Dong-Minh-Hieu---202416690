package hust.soict.dsai.aims.media;

public class DVD extends Disc implements Playable {
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
    @Override
        public int getId() {
        return id;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public String toString() {
        return String.format("DVD - [%s] - [%s] - [%s] - [%d]: %.2f $",
                title, category, director, length, cost);
    }

}