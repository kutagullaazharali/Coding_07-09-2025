
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortedArrayLeetCode {
    public static void main(String[] args) {
        int nums[] = { 0, 2, 1, 1, 2, 0 };
        System.out.println("original Array : " + Arrays.toString(nums));
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("map : "+map);
        int index = 0;
        for (int i = min; i <= max; i++) {
            while(map.getOrDefault(i, 0) > 0) {
                nums[index++] = i;
                map.put(i, map.get(i) - 1);
            }
        }
        System.out.println("Final Array : " + Arrays.toString(nums));
    }
}
