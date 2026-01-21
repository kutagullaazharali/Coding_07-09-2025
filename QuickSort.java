import java.util.Arrays;

public class QuickSort {
    public static int partitionMethod(int nums[], int low, int high) {
        int i = low - 1;
        int povit = nums[high];

        for (int j = low; j < high - 1; j++) {
            if (nums[j] < povit) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;
    return i+1; 
    }
    public static void quickSortMethod(int nums[], int low, int high) {
        if (low < high) {
            int pi = partitionMethod(nums,low,high);
            quickSortMethod(nums, low, pi-1);
            quickSortMethod(nums,pi+1,high);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,4,5};
        System.out.println("Original Array : " + Arrays.toString(nums));
        quickSortMethod(nums, 0, nums.length - 1);
        System.out.println("Sorted Array : "+Arrays.toString(nums));
    }
} 