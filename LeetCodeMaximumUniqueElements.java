import java.util.*;
public class LeetCodeMaximumUniqueElements {
    public int maxDistinctElements(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
         Arrays.sort(nums);
        int curr = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i] - k;
            int end = nums[i] + k;
            int candidate = Math.max(start, curr + 1);
            if (candidate <= end) {
                set.add(candidate);
                curr = candidate;
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        int n[] = { 9,5,5 };
        int k =  0;
        LeetCodeMaximumUniqueElements obj = new LeetCodeMaximumUniqueElements();
        int results = obj.maxDistinctElements(n, k);
        System.out.println("final output : "+results);
    }
}