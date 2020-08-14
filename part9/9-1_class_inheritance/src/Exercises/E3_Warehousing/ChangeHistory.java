package Exercises.E3_Warehousing;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    // Adds provided status as the latest amount
    // to remember in the change history.
    public void add(double status) {
        this.changeHistory.add(status);
    }

    // Empties the history.
    public void clear() {
        this.changeHistory.clear();
    }

    // Returns the largest value in the change history.
    // If the history is empty, the method should return zero.
    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0;
        }

        double max = this.changeHistory.get(0);

        for (Double history : this.changeHistory) {
            if (max < history) {
                max = history;
            }
        }

        return max;
    }

    // Returns the smallest value in the change history.
    // If the history is empty, the method should return zero.
    public double minValue() {
        if (this.changeHistory.isEmpty()) { return 0; }

        double min = this.changeHistory.get(0);

        for (Double history : this.changeHistory) {
            if (min > history) {
                min = history;
            }
        }

        return min;
    }

    // Returns the average of the values in the change history.
    // If the history is empty, the method should return zero.
    public double average() {
        if (this.changeHistory.isEmpty()) { return 0; }

        double avg = 0;

        for (Double history : this.changeHistory) {
            avg += history;
        }

        return avg / this.changeHistory.size();
    }

    // Returns the string representation of the
    // change history. The string representation
    // provided by the ArrayList class is sufficient.
    public String toString() {
        return this.changeHistory.toString();
    }

}