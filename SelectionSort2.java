import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 4, 5, 6, 3 };
        System.out.println("Original Array : " + Arrays.toString(nums));
        for (int i = 0; i < nums.length ; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[index] > nums[j]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}