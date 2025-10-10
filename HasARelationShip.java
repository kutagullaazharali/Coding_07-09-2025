class Engine {
    void start() {
        System.out.println("Car Started");
    }
}
class Car {
    Engine engine;

    public Car() {
        engine = new Engine();
    }

    void start() {
        engine.start();
        System.out.println("Car Moving");
    }
    
}

public class HasARelationShip {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
