package Collections.GenericTypes;

public class Truck extends Vehicle {
    private String fuelType;

    public Truck(String name, double value, int wheelNumber, String fuelType) {
        super(name, value, wheelNumber);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
