package Lectures.L8_Primitive_Variables_In_HashMaps;

import java.util.HashMap;

/*
The following examples describes a class used for counting
the number of vehicle number-plate sightings. Automatic type
conversion takes place in the addSighting and timesSighted methods.
*/
public class registerSightingCounter {
    private HashMap<String, Integer> allSightings;

    public registerSightingCounter() {
        this.allSightings = new HashMap<>();
    }

    public void addSighting(String sighted) {
        // If the given key is not found,
        // set a sighting count in the hash map with a value of 0
//        if (!this.allSightings.containsKey(sighted)) {
//            this.allSightings.put(sighted, 0);
//        }

        // Retrieve the count of the sightings
        // int timesSighted = this.allSightings.get(sighted);

        // Simplified above code with getOrDefault method
        int timesSighted = this.allSightings.getOrDefault(sighted, 0);

        // Increment the particular sighting by one
        timesSighted++;

        // Replace sightings with the new one by adding
        // the incremented count back into the hash map
        this.allSightings.put(sighted, timesSighted);
    }

    public int timesSighted(String sighted) {
        // return this.allSightings.get(sighted); // potentially returns null instead
        // To avoid some risk in type conversions
        return this.allSightings.getOrDefault(sighted, 0);

        /*
         * The getOrDefault method of the HashMap searches for the key passed to it
         * as a parameter from the HashMap. If the key is not found, it returns
         * the value of the second parameter passed to it.
         */
    }
}
