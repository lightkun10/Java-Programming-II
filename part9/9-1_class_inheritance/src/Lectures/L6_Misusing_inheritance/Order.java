package Lectures.L6_Misusing_inheritance;

/* Thinking more closely on the semantics of an order, this seems intuitive.
    "
        An order has a customer.
    "
 */
public class Order {

    private Customer customer;
    private String product;
    private String count;

    public Order(Customer customer, String product, String count) {
        this.customer = customer; this.product = product; this.count = count;
    }

    public String getProduct() {
        return product;
    }

    public String getCount() {
        return count;
    }

    public String postalAddress() {
        return this.customer.getName() + "\n" + this.customer.getAddress();
    }
}

/*
This version of the Order class is better. The method postalAddress uses
the customer reference to obtain the postal address instead of inheriting
the class Customer. This helps both the maintenance of the program and
its concrete functionality.

Now, when a customer changes, all you need to do is change the customer information;
there is no need to change the orders.
 */
