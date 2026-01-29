import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoArraysOptimized {
    static public int[] intersect(int[] n1, int[] n2) {
        if (n1.length > n2.length) {
            return intersect(n2, n1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n1.length; i++) {
            map.put(n1[i], map.getOrDefault(n1[i], 0) + 1);
        }
        for (int i = 0; i < n2.length; i++) {
            if (map.containsKey(n2[i]) && map.get(n2[i]) > 0) {
                res.add(n2[i]);
                map.put(n2[i], map.getOrDefault(n2[i], 0) - 1);
            }
        }
        int output[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        int res[] = intersect(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
