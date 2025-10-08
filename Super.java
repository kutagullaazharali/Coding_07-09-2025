class parent {
    int x = 100;
}
class Child extends parent {
    static int x = 50;
}
public class Super {
    static int x = 10;
    public static void main(String[] args) {
        Child c = new Child();
        parent p = new parent();
        System.out.println(x);
        System.out.println(c.x);
        System.out.println(p.x);
    }
}
