// Abstract base class
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Common method for all vehicles
    abstract void start();
}

// Car class
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " car started.");
    }

    void turnOnAC() {
        System.out.println(brand + " AC turned on.");
    }
}

// Bike class
class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " bike started.");
    }

    void kickStart() {
        System.out.println(brand + " bike kickstarted.");
    }
}

// Truck class
class Truck extends Vehicle {

    Truck(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " truck started.");
    }

    void loadCargo() {
        System.out.println(brand + " cargo loaded.");
    }
}

// Main class
public class TypeCastRealTimeEx {

    public static void main(String[] args) {
        // Primitive type casting example
        double fuel = 12.75;
        int roundedFuel = (int) fuel; // narrowing casting
        System.out.println("Rounded fuel: " + roundedFuel + " liters\n");

        // Upcasting examples
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Honda");
        Vehicle v3 = new Truck("Volvo");

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            v.start(); // works for all vehicles

            // Downcasting to access specific methods
            if (v instanceof Car) {
                Car car = (Car) v;
                car.turnOnAC();
            } else if (v instanceof Bike) {
                Bike bike = (Bike) v;
                bike.kickStart();
            } else if (v instanceof Truck) {
                Truck truck = (Truck) v;
                truck.loadCargo();
            }

            System.out.println();
        }
    }
}