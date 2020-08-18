package Exercises.E6_Online_shop;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    // Adds an item to the cart that matches
    // the product given as a parameter,
    // with the price given as a parameter.
    public void add(String product, int price) {

        // if a product is being added thats already in the cart,
        // don't add a new item, but instead update item already
        // in the cart by calling its increaseQuantity() method.
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }

    // Returns the total price of the shopping cart
    public int price() {
        Collection<Item> items = this.cart.values();

        int price = 0;
        for (Item item : items) {
            price += item.price();
        }

        return price;
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }

}