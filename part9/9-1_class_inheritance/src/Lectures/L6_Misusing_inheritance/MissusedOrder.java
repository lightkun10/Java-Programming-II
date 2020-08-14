package Lectures.L6_Misusing_inheritance;

public class MissusedOrder extends Customer {

    private String product;
    private String count;

    /*
    The misuse shows itself in how the code breaks the
    single responsibility principle: the Order class is
    responsible both for maintaining the customer information
    and the order information.
    */
    public MissusedOrder(String product, String count, String name, String address) {
        super(name, address);
        this.product = product;
        this.count = count;
    }

    public String getProduct() {
        return product;
    }

    public String getCount() {
        return count;
    }

    public String postalAddress() {
        return this.getName() + "\n" + this.getAddress();
    }
}
