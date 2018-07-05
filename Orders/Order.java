package Orders;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public Order(Item... items) {
        this();
        if (items != null) {
            for (Item item : items) {
                addItem(item);
            }
        }
    }

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

}
