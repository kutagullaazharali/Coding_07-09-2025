import java.util.Arrays;

public class MoveZerosLast {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 0, 3, 0, 4 };
        System.out.println("Original Array : "+Arrays.toString(nums));
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        System.out.println("Test Array : "+Arrays.toString(nums));
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println("Final Array : "+Arrays.toString(nums));
    }
}