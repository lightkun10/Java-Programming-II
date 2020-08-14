public class Container {
    // Class variable
    private int volume;
    private int limit;
    private int constraint;
    private int move;

    // Constructor
    public Container() {
        this.volume = 0;
        this.limit = 100;
        this.constraint = 0;
        this.move = 0;
    }

    /* Methods */
    public int contains() {
        return this.volume;
    }

    // adds the amount of liquid given as a parameter to
    // the container. If the amount is negative, no liquid
    // is added. A container can hold maximum of 100 units of liquid.
    public void add(int amount) {
        if (amount >= 0) {
            if (this.volume + amount <= limit) {
                this.volume += amount;
            } else if (this.volume + amount > limit) {
                int adder = limit - this.volume;
                this.volume = this.volume + adder;
            }
        }
    }

    //  removes the amount of liquid given as a parameter from
    //  the container. If the amount is negative, no liquid is
    //  removed. A container can never hold less than 0 units of liquid.
    public void remove(int amount) {
        if (amount >= 0) {
            if (this.volume - amount >= constraint) {
                if (amount > this.volume) {
                    this.move = amount - this.volume;
                } else {
                    this.move = amount;
                }

                this.volume -= amount;
            } else if (this.volume - amount < constraint) {
                this.move = amount - (amount - this.volume);
                this.volume = this.volume - this.move;
            }
        }
    }

    public int moveContainer() {
        return this.move;
    }

    //  returns the container as a string formatted "amount of liquid/100",
    //  for example "32/100".
    public String toString() {
        return this.volume + "/" + this.limit;
    }

}
