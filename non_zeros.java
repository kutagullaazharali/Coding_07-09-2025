
import java.util.Arrays;

class non_zeros {
    public static void main(String[] args) {
        int n = 100;
        non_zeros obj = new non_zeros();
        int results[] = obj.getNonIntegers(n);
        System.out.println("Final Output : " + Arrays.toString(results));
    }

    public int[] getNonIntegers(int num) {

        for (int a = 1; a < num; a++) {
            int b = num - a;
            if (isZero(a) && isZero(b)) {
                return new int[] { a, b };
            }
        }

        return new int[0];
    }

    public static boolean isZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}