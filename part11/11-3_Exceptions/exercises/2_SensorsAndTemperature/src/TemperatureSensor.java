import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensorOn;

    public TemperatureSensor() {
        this.sensorOn = false;
    }

    public boolean isOn() {
        if (sensorOn == true) {
            return true;
        }

        return false;
    }

    public void setOn() {
        this.sensorOn = true;
    }

    public void setOff() {
        this.sensorOn = false;
    }

    public int read() {
        if (!this.sensorOn) {
            throw new IllegalStateException("Sensor is off.");
        }

        // Randomly chooses an integer in the range -30...30 and returns it.
        return getRandomNumberWithNegativeNumInRange(30, -30);
    }

    private int getRandomNumberWithNegativeNumInRange(int max, int min) {
        // From: https://stackoverflow.com/questions/27976857/how-to-get-random-number-with-negative-number-in-range
        // To get random number between a set range with min and max:
        // random.nextInt(max - min) + min;

        // Example: max = 30; min = -30;
        // random.nextInt(30 - (-30)) + (-30);
        return new Random().nextInt( max - min ) + min;
    }

}