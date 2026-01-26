import java.util.Arrays;

public class ArraySumExceptSelf {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int results[] = new int[nums.length];
        for (int i = 0, tempval = 1; i < nums.length; i++) {
            arr1[i] = tempval;
            tempval = tempval * nums[i];
        }
        for (int i = nums.length - 1, tempval = 1; i >= 0; i--) {
            arr2[i] = tempval;
            tempval = tempval * nums[i];
        }
         for (int i = 0; i < nums.length; i++) {
            results[i] = arr1[i] * arr2[i];;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(results));
    }
}
