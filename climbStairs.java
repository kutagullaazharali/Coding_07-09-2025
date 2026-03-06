import java.util.*;

public class climbStairs {
    public static void main(String[] args) {
        int steps = 2;
        int dp[] = new int[steps + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= steps; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
    }
}
