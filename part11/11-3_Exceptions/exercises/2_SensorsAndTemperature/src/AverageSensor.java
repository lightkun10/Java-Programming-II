import java.util.ArrayList;
import java.util.List;

/*
An average sensor includes multiple sensors.
*/

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readS;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readS = new ArrayList<>();
    }

    // Add a new sensor for the average sensor to control.
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readS;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }

        return true;
    }

    // An AverageSensor is on when all its sensors are on.
    // When setOn is called, all the sensors must be set on.
    @Override
    public void setOn() {
        for (Sensor s : this.sensors) {
            s.setOn();
        }
    }

    // When setOff is called, at least one of the sensors must be set off.
    // It's also acceptable to set off all the sensors.
    @Override
    public void setOff() {
        for (Sensor s : this.sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {

        if (!this.isOn() || this.sensors.size() == 0) {
            throw new IllegalStateException("Sensor is off.");
        }

        int totalRead = this.sensors.stream()
                .map(s -> s.read())
                .reduce(0, (prev, val) -> prev + val);

        int avgRead =  totalRead / this.sensors.size();
        this.readS.add(avgRead);
        return avgRead;
    }

}
