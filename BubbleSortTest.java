import java.util.*;

class BubbleSortTest {
    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}