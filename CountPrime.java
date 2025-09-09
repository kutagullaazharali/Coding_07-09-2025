
public class CountPrime {
    public static int countPrime(int n) {

        if (n <= 2) {
            return 0;
        }
        boolean arr[] = new boolean[n];

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                arr[i] = true;
            }
        }
        int count = 0;
        for (boolean elem : arr) {
            if (elem == true) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        int results = countPrime(n);
        System.out.println("final output : " + results);
    }
}
