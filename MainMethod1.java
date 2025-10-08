// ...existing code...
abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eat meat");
    }
    @Override
    public void sleep() {
        System.out.println("dog will sleep in kennel");
    }
        public Dog() {} // explicit no-arg constructor

}
public class MainMethod1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.sleep();
    }
}
// ...existing code...