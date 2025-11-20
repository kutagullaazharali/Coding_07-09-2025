public class SubArray3 {
    public static int getMaxSubarray(int num[], int k) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res += num[i];
        }
        sum = res;
        for (int j = k; j < num.length; j++) {
            res += num[j] - num[j - k];
            sum = Math.max(res, sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
        int k = 3;
        int res = getMaxSubarray(arr, k);
        System.out.println("final output : "+res);
    }
}
