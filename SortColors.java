
import java.util.Arrays;

public class SortColors {
    public static void swap(int nums[], int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void sortColors(int[] nums) {
        int zeroPointer = 0;
        int twoPointer = nums.length - 1;
        int i = 0;
        while (i<=twoPointer) { 
            if (nums[i] == 0) {
                swap(nums, i, zeroPointer);
                i++;
                zeroPointer++;
            }
            else if (nums[i]==2) {
                swap(nums, i, twoPointer);
                twoPointer--;
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        SortColors obj = new SortColors();
        int nums[] = { 0, 1, 2, 0, 1, 2 };
        System.out.println("before sort : "+ Arrays.toString(nums));
        obj.sortColors(nums);
        System.out.println("after sort : "+ Arrays.toString(nums));
    }
}
