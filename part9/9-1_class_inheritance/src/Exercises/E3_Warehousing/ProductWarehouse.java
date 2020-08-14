package Exercises.E3_Warehousing;

public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    // Sets a new name for the product.
    public void setName(String newName) {
        this.productName = newName;
    }

    // Returns the state of the object represented
    // as a string. Juice: balance = 64.5, space left 123.5
    public String toString() {
        return this.productName + ": " + super.toString();
    }

}