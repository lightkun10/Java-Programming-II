package Exercises.E2_StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Set;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    // Adds the parameter item to the storage
    // unit that is also given as a parameter.
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    // Returns a list that contains all the items
    // in the storage unit indicated by the parameter.
    // If there is no such storage unit or it contains
    // no items, the method should return an empty list.
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    // Removes the given item from the given storage unit.
    public void remove(String storageUnit, String item) {
        if (!this.storage.containsKey(storageUnit)) {
            return;
        }

        // Delete the item of specific storage unit
        this.storage.get(storageUnit).remove(item);

        // If the storageunit is empty, drop the storage entirely
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    // Returns the names of the storage units as a list.
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for (String unit : this.storage.keySet()) {
            units.add(unit);
        }

        return units;
    }
}