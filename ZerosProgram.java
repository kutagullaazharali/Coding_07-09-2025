import java.util.Arrays;

public class ZerosProgram {
    public static void main(String[] args) {
        int n[] = { 1, 0, 0, 1, 0, };
        System.out.println("original array :" + Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 1) {
                swapMethod(n, i);
            }
        }
        System.out.println("Modified array :" + Arrays.toString(n));
    }

    private static void swapMethod(int[] n, int i) {
        for (int k = i + 1; k < n.length; k++) {
            if (n[k] == 0) {
                int temp = n[i];
                n[i] = n[k];
                n[k] = temp;
            }
        }
    }
}
