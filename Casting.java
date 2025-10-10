class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barking...");
    }
}
public class Casting {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        if(a instanceof Dog) {
            Dog d = (Dog) a;
            d.sound();
        }
    }
}