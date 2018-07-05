package Imitations;

import Orders.Item;
import Orders.Order;

public class CustomerImitation {

    public static void main(String[] args) {
        final Item[] arrayOfItems = {new Item("Ручка"), new Item("Карандаш"), new Item("Пенал")};
        final Order order = new Order(arrayOfItems);
        order.addItem(new Item("Подшипник"));
        order.addItem(new Item("Колесо"));
        order.printItems();
    }
}
