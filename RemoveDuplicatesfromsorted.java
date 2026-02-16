import java.util.Arrays;

public class RemoveDuplicatesfromsorted {
    static public int removeDuplicates(int[] nums) {
        int output = 0;

        int j = 1;
        System.out.println("Start");
        System.out.println(Arrays.toString(nums));

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                output++;
                j++;
            }
        }
        System.out.println("Start");
        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
