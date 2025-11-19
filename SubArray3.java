public class SubArray3 {
    public static int getMaxSubarray(int num[], int k) {
        int res = 0;
        for (int i = 0; i < num.length-k; i++) {
            int n1 = num[i];
            int n2 = num[i+1];
            int n3 = num[i + 2];
            res = Math.max(res, n1 + n2 + n3);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
        int k = 3;
        int res = getMaxSubarray(arr, k);
        System.out.println("final output : "+res);
    }
}
