/*
A standard sensor is always on.
*/
public class StandardSensor implements Sensor {

    private int num;

    public StandardSensor(int num) {
        this.num = num;
    }

    public boolean isOn() {

        return true;
    }

    public void setOn() {
    }

    public void setOff() {
    }

    public int read() {

        return this.num;
    }
}