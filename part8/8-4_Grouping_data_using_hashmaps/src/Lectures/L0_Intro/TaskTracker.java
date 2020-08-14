package Lectures.L0_Intro;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    // Instance Variables
    private HashMap<String, ArrayList<Integer>> completedExercises;

    // Constructor
    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // An empty list has to be added for a new user,
        // if one has not already been added
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        // Let's first retrieve the list containing the exercises
        // completed by the user and add to it
        // ArrayList<Integer> completed = this.completedExercises.get(user);
        // completed.add(exercise);

        // the previous would also work without the helper variable as follows
        this.completedExercises.get(user).add(exercise);
    }

    public void print() {
        for (String name : this.completedExercises.keySet()) {
            System.out.println(name + ": " + this.completedExercises.get(name));
        }
    }
}
