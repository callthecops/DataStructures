package Collections.GenericTypes;

public class Bike extends Vehicle {
    private String motorbikeBrand;

    public Bike(String name, double value, int wheelNumber, String motorbikeBrand) {
        super(name, value, wheelNumber);
        this.motorbikeBrand = motorbikeBrand;
    }

    public String getMotorbikeBrand() {
        return motorbikeBrand;
    }

    public void setMotorbikeBrand(String motorbikeBrand) {
        this.motorbikeBrand = motorbikeBrand;
    }
}
