package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {
        // 1. Compare by Title (Alphabetical)
        int titleComparison = m1.getTitle().compareTo(m2.getTitle());
        
        // 2. If titles are the same, compare by Cost (Descending: Higher cost first)
        if (titleComparison == 0) {
            return Float.compare(m2.getCost(), m1.getCost());
        }
        
        return titleComparison;
    }
}