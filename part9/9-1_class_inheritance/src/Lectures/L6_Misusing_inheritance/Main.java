package Lectures.L6_Misusing_inheritance;

public class Main {
    public static void main(String[] args) {
        MissusedOrder order1 = new MissusedOrder("Betadine", "1", "Pandu", "Lobak 115");
        // System.out.println(order1.postalAddress());
        order1.setAddress("Jl. Lobak no.115");
        // System.out.println(order1.postalAddress());

        /*
        Above inheritance is not used correctly. When inheriting, the subclass
        must be a special case of the superclass; an order is definitely not
        a special case of a customer. The misuse shows itself in how the code
        breaks the single responsibility principle: the Order class is responsible
        both for maintaining the customer information and the order information.

        The problem becomes very clear when we think of what a change in a
        customer's address would cause.

        In the case that an address changes, we would have to change every order
        object that relates to that customer. This is hardly ideal.
        A better solution would be to encapsulate the customer as an object
        variable of the Order class. Thinking more closely on the semantics
        of an order, this seems intuitive. An order has a customer.

        Let's modify the Order class so that it includes a reference to a Customer object.
        */
        Customer c1 = new Customer("Pandu", "Jl. Lobak no. 115");
        Order order = new Order(c1, "Betadrone", "1");

        System.out.println(order.postalAddress());

        /*
        This version of the Order class is better. The method postalAddress uses
        the customer reference to obtain the postal address instead of inheriting
        the class Customer. This helps both the maintenance of the program and
        its concrete functionality.

        Now, when a customer changes, all you need to do is change the
        customer information; there is no need to change the orders.
        */
    }
}
