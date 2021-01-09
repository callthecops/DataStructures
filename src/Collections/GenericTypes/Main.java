package Collections.GenericTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new TruckDriver(5, "Gigel", 34);
        Person person2 = new TruckDriver(9, "Diamant", 44);
        Person person3 = new Biker(500, "FiulLuSatana", 19);
        Person person4 = new Biker(14, "BatranulOrb", 99);

        Vehicle vehicle1 = new Truck("Man", 1241.35, 8, "Diesel");
        Vehicle vehicle2 = new Truck("Kamaz", 9999.99, 12, "Gasoline");
        Vehicle vehicle3 = new Bike("MyBike", 55, 2, "Kawasaki");
        Vehicle vehicle4 = new Bike("Baby", 99, 2, "Honda");

        List<Person> truckDrivers = new ArrayList<>();
        List<Person> bikers = new ArrayList<>();
        List<Person> allPersons = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();
        List<Vehicle> bikes = new ArrayList<>();
        List<Vehicle> allVehicles = new ArrayList<>();

        Collections.addAll(truckDrivers, person1, person2);
        Collections.addAll(bikers, person3, person4);
        Collections.addAll(trucks, vehicle1, vehicle2);
        Collections.addAll(bikes, vehicle3, vehicle4);
        Collections.addAll(allPersons, person1, person2, person3, person4);
        Collections.addAll(allVehicles, vehicle1, vehicle2, vehicle3, vehicle4);


        GenericClass genericClass = new GenericClass();
        List<Vehicle> vehicles = genericClass.printAndReturnVehicle(allVehicles);
        for (Vehicle v : vehicles) {
            System.out.println(v.getName());
        }
        Container container = genericClass.printAndReturnEverything(allPersons, allPersons);
        List<Person> p = container.getPersons();
        List<Vehicle> v = container.getVehicles();

        for (Person pers : p) {
            System.out.println(pers.getAge());
        }
        for (Vehicle vehicle : v) {
            System.out.println(vehicle.getName());
        }


    }

}
