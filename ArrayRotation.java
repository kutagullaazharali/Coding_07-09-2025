import java.util.Arrays;

public class ArrayRotation {
    public static void rotate(int nums[],int start,int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        k = k % n.length;
        System.out.println("Original Array" + Arrays.toString(n));
        rotate(n, 0, n.length - 1);
        rotate(n, 0, k-1);
        rotate(n, k, n.length - 1);
        System.out.println("Original Array" + Arrays.toString(n));
    }
}
