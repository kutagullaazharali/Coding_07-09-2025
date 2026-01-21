class Testrecursion {
    public static void printNumbers(int current) {
        if (current > 5) {
            return;// System.out.println(n);
        }
        
        System.out.println(current);
        printNumbers(current + 1);
        System.out.println("Completed");
    }
    public static void main(String[] args) {
        int m = 1;
        printNumbers(m);
    }
}