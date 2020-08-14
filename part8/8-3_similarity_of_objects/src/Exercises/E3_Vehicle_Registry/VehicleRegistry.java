package Exercises.E3_Vehicle_Registry;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class VehicleRegistry {

    // Instance Variable
    private HashMap<LicensePlate, String> vehicleRegistry;

    // Constructor
    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    /*
    Assigns the owner it received as a parameter to
    a car that corresponds to the license plate received
    as a parameter. If the license plate doesn't have an
    owner, the method returns true. If the license already
    has an owner attached, the method returns false & does nothing.
    */
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.vehicleRegistry.containsKey(licensePlate)) {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    /*
    Returns the owner of the car corresponding to the license plate
    received as a parameter. If the car isn't in the registry, the
    method returns null.
    */
    public String get(LicensePlate licensePlate) {
        if (!this.vehicleRegistry.containsKey(licensePlate)) {
            return null;
        }

        return this.vehicleRegistry.get(licensePlate);
    }

    /*
    Removes the license plate and attached data from the registry.
    The method returns true if removed successfully and false if
    the license plate wasn't in the registry.
    */
    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicleRegistry.containsKey(licensePlate)) {
            this.vehicleRegistry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    // Prints the license plates in the registry.
    public void printLicensePlates() {
        Set<LicensePlate> licensePlates = this.vehicleRegistry.keySet();

        for (LicensePlate license : licensePlates) {
            System.out.println(license);
        }

        // System.out.println(this.vehicleRegistry);
    }

    // Prints the owners of the cars in the registry. Each name
    // should only be printed once, even if a particular person
    // owns more than one car.
    public void printOwners() {
        Collection<String> owners = this.vehicleRegistry.values();
        ArrayList<String> savedO = new ArrayList<>();

        for (String owner : owners) {
            if (savedO.contains(owner)) {
                continue;
            }
            savedO.add(owner);
            System.out.println(owner);
        }
    }
}