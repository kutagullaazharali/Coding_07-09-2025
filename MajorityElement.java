import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxElement = nums[0];
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentCount++;
            }
            else {
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxElement = nums[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int res = majorityElement(nums);
        System.out.println("final output : " + res);
    }
}
