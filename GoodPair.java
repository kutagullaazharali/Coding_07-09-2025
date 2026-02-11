import java.util.*;
public class GoodPair {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    output++;
                }
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            count += map.getOrDefault(i, 0);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(output);
        System.out.println(count);
    }
}
