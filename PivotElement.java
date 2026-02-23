class PiovtElement {
    public static int sum(int n) {
        int output = 0;
        while (n != 0) {
            output += n % 10;
            n /= 10;
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 199;
        /*
         * do {
         * n = sum(n);
         * } while (n > 9);
         */
        System.out.println(n);

        while (true) {
            n = sum(n);
            if (n < 9) {
                break;
            }
        }
        System.out.println(n);

        int num = 199;
        int result = 1 + (num - 1) % 9;
        System.out.println(result);

    }
}