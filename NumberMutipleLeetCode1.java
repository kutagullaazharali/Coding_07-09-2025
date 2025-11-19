import java.util.*;

class NumberMutipleLeetCode1 {
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i : nums) {
            if (i == original) {
                original = i * 2;
            }
        }
        return original;
    }

    public static void main(String[] args) {
        int n[] = { 1, 1, 2, 3, 4, 5, 6, 12, 11, 24, };
        int target = 3;
        int results = findFinalValue(n, target);
        System.out.println("final results :  " + results);
    }
}