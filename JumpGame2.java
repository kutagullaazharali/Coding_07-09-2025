public class JumpGame2 {
    static public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int maxReach = 0;
        for (int i = 0; i < nums.length-2; i++) {
            maxReach = Math.max(maxReach, nums[i] + i);
            if (i == currentEnd) {
                jumps++;
                currentEnd = maxReach;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 1, 4 };
        System.out.println(jump(nums));
    }
}
