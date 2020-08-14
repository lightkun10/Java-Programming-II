package Exercises.E3_Warehousing;

public class Warehouse {

    private double capacity;
    private double balance;

    // Creates an empty warehouse, which has the capacity
    // provided as a parameter; an invalid capacity (<=0)
    // creates a useless warehouse, with the the capacity 0.
    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    // Returns the balance of the warehouse, i.e. the capacity
    // which is taken up by the items in the warehouse.
    public double getBalance() {
        return this.balance;
    }

    // Returns the total capacity of the warehouse
    // (i.e. the one that was provided in the constructor).
    public double getCapacity() {
        return this.capacity;
    }

    // Returns a value telling how much space is left
    // in the warehouse.
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    // Adds the desired amount to the warehouse;
    // if the amount is negative, nothing changes, and
    // if everything doesn't fit, then the warehouse is
    // filled up and the rest is "thrown away" / "overflows".
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    // Take the desired amount from the warehouse. The method
    // returns much we actually get. If the desired amount is
    // negative, nothing changes and we return 0. If the desired
    // amount is greater than the amount the warehouse contains,
    // we get all there is to take and the warehouse is emptied.
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    // Returns the state of the object represented as a string
    // balance = 64.5, space left 123.5
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}