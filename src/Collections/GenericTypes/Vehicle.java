package Collections.GenericTypes;

public class Vehicle {

    private String name;
    private double value;
    private int wheelNumber;

    public Vehicle(String name, double value, int wheelNumber) {
        this.name = name;
        this.value = value;
        this.wheelNumber = wheelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }
}
