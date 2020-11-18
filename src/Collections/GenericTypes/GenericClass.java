package Collections.GenericTypes;

import java.util.List;

public class GenericClass<T extends Vehicle, R> {

    public <T extends Vehicle> List<T> printAndReturnVehicle(List<T> vehicles) {

        for (T vehicle : vehicles) {
            System.out.println(vehicle.getName());
            System.out.println(vehicle.getValue());
            System.out.println(vehicle.getValue());
            if (vehicle instanceof Truck) {
                Truck truck = ((Truck) vehicle);
                System.out.println(truck.getFuelType());
            } else {
                Bike bike = ((Bike) vehicle);
                System.out.println(bike.getMotorbikeBrand());
            }
        }

        return vehicles;
    }

    public <R extends Person> Container printAndReturnEverything(List<R> persons, List<T> vehicles) {
        for (Person p : persons) {
            System.out.println(p.getAge());
            System.out.println(p.getName());
            if (p instanceof Biker) {
                Biker biker = (Biker) p;
                System.out.println(biker.getGearValue());
            } else {
                TruckDriver truckDriver = (TruckDriver) p;
                System.out.println(truckDriver.getRedneckLevel());
            }
        }

        Container<R, T> container = new Container<R, T>();
        container.setPersons(persons);
        container.setVehicles(vehicles);

        return container;
    }

}
