import java.util.Arrays;

public class RotateArrayLeet {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        rotatemethod(nums, 0, n - 1);
        System.out.println("array 1 : " + Arrays.toString(nums));
        rotatemethod(nums, 0, k - 1);
        System.out.println("array 2 : " + Arrays.toString(nums));
        rotatemethod(nums, k, n - 1);
        System.out.println("array 3 : " + Arrays.toString(nums));
    }

    public static void rotatemethod(int num[], int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println("original array : " + Arrays.toString(nums));
        RotateArrayLeet obj = new RotateArrayLeet();
        obj.rotate(nums, k);
        System.out.println("final array : " + Arrays.toString(nums));
    }
}
