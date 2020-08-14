package Exercises.E5_IOweYou;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iOweYou;

    // Constructor
    public IOU() {
        this.iOweYou = new HashMap<>();
    }

    // Saves the amount owed and the person owed to to the IOU.
    public void setSum(String toWhom, double amount) {
        this.iOweYou.put(toWhom, amount);
    }

    // Returns the amount owed to the person whose name is given
    // as a parameter. If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        return this.iOweYou.getOrDefault(toWhom, 0.00);
    }

}
