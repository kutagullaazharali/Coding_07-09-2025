import java.util.Arrays;

public class Insertionsort2 {

    public static void SelectionSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int midIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[midIndex]) {
                    midIndex = j;
                }
            }
            int temp = nums[midIndex];
            nums[midIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
