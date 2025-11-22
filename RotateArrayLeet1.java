public class RotateArrayLeet1 {
    public void rotate(int[] nums, int k) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i + k % nums.length] = nums[i];
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        RotateArrayLeet1 obj = new RotateArrayLeet1();
        obj.rotate(nums, k);
    }
}
