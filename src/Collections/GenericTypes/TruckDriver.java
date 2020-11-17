package Collections.GenericTypes;

public class TruckDriver extends Person {
    private int redneckLevel;

    public TruckDriver(int redneckLevel, String name, int age) {
        super(name, age);
        this.redneckLevel = redneckLevel;
    }


    public int getRedneckLevel() {
        return redneckLevel;
    }

    public void setRedneckLevel(int redneckLevel) {
        this.redneckLevel = redneckLevel;
    }
}
