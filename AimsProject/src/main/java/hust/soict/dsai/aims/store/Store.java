package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }

    public List<Media> getItemsInStore() {
        return itemsInStore;
    }
}
