
public class Inheritence extends Son {
    public static void main(String[] args) {
        Son s = new Son();
        Father f = new Father();
        f.Playing();
        s.Playing();
        System.out.println(s.Balance());
    }
}
