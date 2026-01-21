import java.util.Arrays;

class TestBubble {
    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Original Array : " + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j+1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}