class Animal {
    void eat() {
        System.out.println("Animal is eating the food");
    }
}
class Dog extends Animal{
     void sound() {
        System.out.println("Dog is barking");
     }
}
public class IsaRelationshipClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sound();
    }
}