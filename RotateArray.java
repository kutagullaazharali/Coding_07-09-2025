import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int num[], int k) {
        int n = num.length;
        reverse(num, 0, n - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, n - 1);
        return num;
    }

    public static void reverse(int num[], int start, int end) {
        while (start <= end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 9;
        k = k % n.length;
        System.out.println("original Array : "+Arrays.toString(n));
        rotateArray(n, k);
        System.out.println("Rotated Array : "+Arrays.toString(n));
    }
}
