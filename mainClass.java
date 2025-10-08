class Animal{
    void sound() {
        System.out.println("animal making sound ");
    }
}
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class mainClass {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
