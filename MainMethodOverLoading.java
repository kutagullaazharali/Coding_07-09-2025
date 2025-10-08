public class MainMethodOverLoading {
    public static void main(String[] args) {
        System.out.println("Main Method...");
        main();
        main(new char[] {'c','c'});
    }
     public static void main() {
        System.out.println("Main Method...with out parameters");
    }
     public static void main(char[] args) {
        System.out.println("Main Method...char Array....");
    }
     public static void main(boolean[] args) {
        System.out.println("Main Method...");
    }
    public static void main(float[] args) {
        System.out.println("Main Method...");
    }
}
