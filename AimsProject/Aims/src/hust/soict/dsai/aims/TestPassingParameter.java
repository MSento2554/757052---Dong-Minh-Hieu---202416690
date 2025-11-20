package hust.soict.dsai.aims;
import hust.soict.dsai.aims.media.DVD;

public class TestPassingParameter {
    public static void main(String[] args) {
        DVD jungleDVD = new DVD("jungle");
        DVD cinderellaDVD = new DVD("cinderella");
        DVD[] swapped = swap(jungleDVD, cinderellaDVD);
        jungleDVD = swapped[0];
        cinderellaDVD = swapped[1];

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
    }

    public static DVD[] swap(DVD d1, DVD d2) {
        DVD tmp = d1;
        d1 = d2;
        d2 = tmp;
        return new DVD[] { d1, d2 };
    }

    public static void changeTitle(DVD dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DVD(oldTitle);
    }
}