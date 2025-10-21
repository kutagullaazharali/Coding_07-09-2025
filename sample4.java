public class sample4 {
    public static int maxSubarray(int num[]) {
        int currentSum = num[0];
        int maxSum = num[0];
        for (int i = 1; i < num.length; i++) {
            currentSum = Math.max(num[i], currentSum + num[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int num[] = { 5, 4, -1, 7, 8 };
        int Output = 23;
        System.out.println("final output : " + maxSubarray(num));
    }
}
