import java.util.*;

public class MajorityElement1 {
    public static int majorityElement(int[] nums) {
        int res = 0;
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if(val > n) {
                res = entry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int res = majorityElement(nums);
        System.out.println("final output : " + res);
    }
}
