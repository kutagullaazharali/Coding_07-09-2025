import java.util.*;
public class longestsubsequence {
    public static void main(String[] args) {
        int nums[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i : dp) {
            res = Math.max(res, i);
        }
        System.out.println("final results : " +res);
    }
}
