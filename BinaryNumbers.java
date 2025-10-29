class BinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int sum = 1;
        while (n != i) {
            System.out.println("Sum Value : " + sum);
            sum = sum * 2 + 1;
            i++;
        }
    }
}