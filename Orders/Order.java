package Orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AndreyX on 05.07.18.
 */
public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<Item>();
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
        //Optional<item>
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
