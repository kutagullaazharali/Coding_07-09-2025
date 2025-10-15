class Parent {
    public void m1() {
        System.out.println("parent method....");
    }
}

public class Poly extends Parent {

    @Override
     public void m1() {
        System.out.println("child method....");
    }
    public static void Man(int a) {
        System.out.println("Integer Parameters Method");
    }

    public static void Man(char a) {
        System.out.println("Character Parameters Method");
    }
     

    public static void Man(int a,int b) {
        System.out.println("Double Parameters Method"+(a+b));

    }
    public static void Man(int a,String n) {
        System.out.println("Double Parameters Method"+a+n);
    }

    public static void main(String[] args) {
        // Man(10);
        // Man(10,"hello");
        // Man(10, 120);
        Man('a');


        Parent p = new Parent();
        Poly p1 = new Poly();
        p.m1();
        p1.m1();
    }
}
