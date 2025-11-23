package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {
        // 1. Compare by Cost (Descending order: Higher cost first)
        // We compare m2 to m1 to get descending order
        int costComparison = Float.compare(m2.getCost(), m1.getCost());
        
        // 2. If costs are the same, compare by Title (Alphabetical)
        if (costComparison == 0) {
            return m1.getTitle().compareTo(m2.getTitle());
        }
        
        return costComparison;
    }
}