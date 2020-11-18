package Collections.GenericTypes;

import java.util.List;

public class Container<R, V> {
    List<R> persons;
    List<V> vehicles;

    public List<R> getPersons() {
        return persons;
    }

    public void setPersons(List<R> persons) {
        this.persons = persons;
    }

    public List<V> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<V> vehicles) {
        this.vehicles = vehicles;
    }
}
