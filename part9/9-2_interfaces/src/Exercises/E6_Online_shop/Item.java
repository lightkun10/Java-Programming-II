package Exercises.E6_Online_shop;

public class Item {

    private String product; // Name of product
    private int qty; // Quantity
    private int unitPrice;

    // Constructor that creates an item corresponding
    // to the product given as a parameter. qty tells
    // us how many of the product are in the item,
    // while unitPrice is the price of a single product.
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Return the price of the item, by
    // multiplying its unit price by its quantity(qty).
    public int price() {
        return this.unitPrice * this.qty;
    }

    // Increases the quantity by one.
    public void increaseQuantity() {
        this.qty += 1;
    }

    // Returns the string representation of the item.
    // toString is formatted like this: " product: qty "
    public String toString() {
        return this.product + ": " + this.qty;
    }

}