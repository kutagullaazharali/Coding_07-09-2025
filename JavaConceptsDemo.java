import java.io.*;
import java.util.*;

// Interface
interface Shape {
    double area();
    double perimeter();
}

// Abstract class
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Inheritance
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Polymorphism
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Encapsulation
class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}

// Multithreading
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

// Main class
public class JavaConceptsDemo {
    public static void main(String[] args) {
        // 1. Basic I/O
        System.out.println("=== Java Concepts Demo ===");

        // 2. Object creation & encapsulation
        Employee emp = new Employee("Azhar", 22);
        System.out.println("Employee: " + emp.getName() + ", Age: " + emp.getAge());

        // 3. Inheritance & abstraction
        Dog dog = new Dog("Tommy");
        dog.eat();
        dog.sound();

        // 4. Polymorphism & interface
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        // 5. Exception Handling
        try {
            int result = 10 / 0; // will cause exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // 6. Collections (ArrayList)
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits List: " + fruits);

        // 7. File Handling
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("This file is created by JavaConceptsDemo program!");
            fw.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        // 8. Multithreading
        MyThread thread = new MyThread();
        thread.start();

        // 9. Lambda expression
        Runnable runnable = () -> System.out.println("Running from Lambda Expression!");
        new Thread(runnable).start();

        // 10. Generics
        GenericBox<Integer> intBox = new GenericBox<>(123);
        GenericBox<String> strBox = new GenericBox<>("Hello Java");
        System.out.println("Generic Integer Box: " + intBox.getData());
        System.out.println("Generic String Box: " + strBox.getData());
    }
}

// Generic class
class GenericBox<T> {
    private T data;

    GenericBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
