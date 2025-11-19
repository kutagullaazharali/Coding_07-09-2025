import java.util.*;

class NumberMutipleLeetCode {
    public static int findFinalValue(int[] nums, int original) {
        int res = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : nums) {
            al.add(i);
        }
        while (al.contains(original)) {
            original = original * 2;
        }
        return original;
    }

    public static void main(String[] args) {
        int n[] = { 1,1, 2, 3, 4, 5, 6, 12,11,24,};
        int target = 3;
        int results = findFinalValue(n, target);
        System.out.println("final results :  " + results);
    }
}