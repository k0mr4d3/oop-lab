public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else {
            System.out.println("The cart is full, cannot add disc");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc itemsOrderedRemoved[] = new DigitalVideoDisc[qtyOrdered - 1];
        int j = 0;
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i] != disc) {
                itemsOrderedRemoved[j] = itemsOrdered[i];
                j++;
            }
        }
        qtyOrdered--;
        itemsOrdered = itemsOrderedRemoved;
        System.out.println("The disc has been removed");
    }

    public float totalCost() {
        float totalCost = 0.0f;

        for (int i=0; i<qtyOrdered; ++i) {
            totalCost += itemsOrdered[i].getCost();
        }

        return totalCost;
    }
}
