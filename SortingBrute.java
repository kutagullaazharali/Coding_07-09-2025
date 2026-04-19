
import java.util.Arrays;

public class SortingBrute {
    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        int n = nums.length;
        System.out.println("Original Array : " + Arrays.toString(nums));
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                count++;
                System.out.println("Test Array : " + Arrays.toString(nums));
            }
        }
        System.out.println(count);
        System.out.println("Updated Array : " + Arrays.toString(nums));
    }
}
