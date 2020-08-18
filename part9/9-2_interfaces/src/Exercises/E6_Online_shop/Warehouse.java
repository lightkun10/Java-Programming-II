package Exercises.E6_Online_shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> storage;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.storage = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    // Adds a product to the warehouse with the
    // price and stock balance given as parameters.
    public void addProduct(String product, int price, int stock) {
        this.storage.put(product, price);
        this.stockBalance.put(product, stock);
    }

    // Which returns the price of the product it
    // received as a parameter. If the product
    // hasn't been added to the warehouse, the
    // method must return -99.
    public int price(String product) {
        if (!this.storage.containsKey(product)) {
            return -99;
        }

        return this.storage.get(product);
    }

    // Returns the current remaining stock of the product
    // in the warehouse. If the product hasn't been added
    // to the warehouse, the method must return 0.
    public int stock(String product) {
        if (!this.storage.containsKey(product)) {
            return 0;
        }

        return this.stockBalance.get(product);
    }

    // Reduces the stock remaining for the product it received
    // as a parameter by one, and returns true if there was
    // stock remaining. If the product was not available in
    // the warehouse the method returns false.
    // A products stock can't go below zero.
    public boolean take(String product) {
        if (!this.storage.containsKey(product)) {
            return false;
        }

        int curStock = this.stockBalance.get(product);
        curStock -= 1;

        if (curStock >= 0) {
            this.stockBalance.replace(product, curStock);
            return true;
        }

        else {
            curStock = 0;
            this.stockBalance.replace(product, curStock);
            return false;
        }
    }

    // Returns the names of the products in the warehouse as a Set
    public Set<String> products() {
        return this.storage.keySet();
    }

}
