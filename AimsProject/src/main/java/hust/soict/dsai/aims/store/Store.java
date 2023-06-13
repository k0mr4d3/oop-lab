package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[65536];

    public void addDVD(DigitalVideoDisc disc) {
        int index = itemsInStore.length - 1;
        itemsInStore[index] = disc;
    }

    public void removeDVD(DigitalVideoDisc disc) {
        DigitalVideoDisc itemsInStoreRemoved[] = new DigitalVideoDisc[itemsInStore.length - 1];
        int j = 0;
        for (int i = 0; i < itemsInStore.length; ++i) {
            if (itemsInStore[i] != disc) {
                itemsInStoreRemoved[j] = itemsInStore[i];
                j++;
            }
        }
        itemsInStore = itemsInStoreRemoved;
    }

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }
}
