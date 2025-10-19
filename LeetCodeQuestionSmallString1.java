import java.util.Arrays;

public class LeetCodeQuestionSmallString1 {

    // Add 'v' to all odd indices
    public static void addMethod(String num[], int v) {
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 1) {
                int digit = Integer.parseInt(num[i]);
                int finalValue = (digit + v) % 10; // wrap around after 9
                num[i] = String.valueOf(finalValue);
            }
        }
    }

    // Rotate array to right by b positions
    public static void rotateArray(String[] arr, int b) {
        int n = arr.length;
        b = b % n;
        String[] temp = new String[n];
        for (int i = 0; i < n; i++) {
            temp[(i + b) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Compare two strings lexicographically
    public static String minString(String a, String b) {
        return (a.compareTo(b) < 0) ? a : b;
    }

    public static String findLexSmallestString(String s, int a, int b) {
        String smallest = s;
        String arr[] = s.split("");

        // We will use brute force as per your logic: rotate + add multiple times
        int n = arr.length;

        for (int rotation = 0; rotation < n; rotation += b) { // try all rotations
            String tempArr[] = Arrays.copyOf(arr, n);

            // Try adding 'a' multiple times on odd indices (max 10 times to cycle digits)
            for (int addCount = 0; addCount < 10; addCount++) {
                String current = String.join("", tempArr);
                smallest = minString(smallest, current);

                addMethod(tempArr, a); // add 'a' to odd indices
            }

            rotateArray(arr, b); // rotate original array for next iteration
        }

        return smallest;
    }

    public static void main(String[] args) {
        String s = "74";
        int a = 5, b = 1;
        System.out.println("Input: " + s);
        String output = findLexSmallestString(s, a, b);
        System.out.println("Output: " + output); // Expected: "2050"
    }
}
