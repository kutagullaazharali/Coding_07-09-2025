import java.util.*;
class LeftAndRightSumDiffNew {
    public static void main(String[] args) {
        int nums[] = { 10, 4, 8, 3 };
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int prefix = 0;
        int ans[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int right = total - prefix - nums[i];
            ans[i] = Math.abs(right - prefix);
            prefix += nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}