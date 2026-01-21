import java.util.Arrays;

public class InsertionSort1 {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 3, 5, 4 };
        System.out.println("Before sort : " + Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        System.out.println("After sort : " + Arrays.toString(nums));
    }
}
