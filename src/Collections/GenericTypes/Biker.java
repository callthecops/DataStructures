package Collections.GenericTypes;

public class Biker extends Person {
    private int gearValue;

    public Biker(int gearValue, String name, int age) {
        super(name, age);
        this.gearValue = gearValue;
    }
}
