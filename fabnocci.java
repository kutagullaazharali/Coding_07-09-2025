class fabnoccci {
    public static int getfabci(int n) {
        if(n < 2) {
            return n;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.println(dp[i]);
        }
    return dp[n];
    }
    public static void main(String[] args) {
       System.out.println(getfabci(4));
    }
}