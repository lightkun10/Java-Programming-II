package Exercises.E3_Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    // Creates a product warehouse. The product name,
    // capacity, and initial balance are provided as
    // parameters. Set the initial balance as the initial
    // balance of the warehouse, as well as the first value
    // of the change history.
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    // Returns the product history like this [0.0, 119.2, 21.2].
    // Use the string representation of the ChangeHistory object as is
    public String history() {
        return this.history.toString();
    }

    // Works just like the method in the Warehouse class,
    // but we also record the changed state to the history.
    // NB: the value recorded in the history should be the
    // warehouse's balance after adding, not the amount added!
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    // Works just like the method in the Warehouse class, but
    // we also record the changed state to the history.
    // NB: the value recorded in the history should be the
    // warehouse's balance after removing, not the amount removed!
    public double takeFromWarehouse(double amount) {
        double amt =  super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());

        return amt;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }

}