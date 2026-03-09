import java.util.*;

class CumulativeSum {
    public static void main(String[] args) {
        int prefix[] = { 2, 4, 6, 8, 10 };
        int cumulative[] = new int[prefix.length];
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(cumulative));

        for (int i = 0; i < prefix.length; i++) {
            if (i >= 1) {
                cumulative[i] = cumulative[i - 1] + prefix[i];
            } else {
                cumulative[i] = prefix[i];
            }
        }
        System.out.println(Arrays.toString(cumulative));
    }
}