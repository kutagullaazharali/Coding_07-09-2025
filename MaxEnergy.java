public class MaxEnergy {
    public static int getMaxEnergy(int []nums,int k) {
        int n = nums.length;
        int maxEle = Integer.MIN_VALUE;
        for(int i = n-1; i>=0; i--) {
            if (i+k < n) {
                nums[i] += nums[i+k];
            }
            maxEle = Math.max(maxEle, nums[i]);
        }
        return maxEle;
    }
    public static void main(String[] args) {
        int num[]  = {5, 2, -10, -3, 7};
        int k = 2;
        System.out.println(getMaxEnergy(num,k));
    }
}
