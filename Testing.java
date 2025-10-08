public class Testing {
    int a;          // int
    double d;       // double
    boolean b;      // boolean
    char c;         // char
    String s;       // object reference
    static int number;

    

    public static void main(String[] args) {
        Testing obj = new Testing();
        System.out.println("int: " + obj.a);
        System.out.println("double: " + obj.d);
        System.out.println("boolean: " + obj.b);
        System.out.println("char: " + obj.c);
        System.out.println("String: " + obj.s);
        System.out.println(number+" : number");
    }
}
