class TestingFactors {
    public static void main(String args[]) {
     int n = 6;
        System.out.print("Factors of " + n + " are: ");

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");

                if (i != n / i) {
                   System.out.print(n / i + " ");
                }
            }
        }
    }
}