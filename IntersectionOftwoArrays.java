import java.util.*;

public class IntersectionOftwoArrays {
    public static void makeArray(int key, int value, ArrayList<Integer> res) {
        while (value > 0) {
            res.add(key);
            value--;
        }
    }

    public static int[] interSectionMethod(int[] n1, int[] n2) {
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n1.length; i++) {
            map1.put(n1[i], map1.getOrDefault(n1[i], 0) + 1);
        }
        for (int i = 0; i < n2.length; i++) {
            map2.put(n2[i], map2.getOrDefault(n2[i], 0) + 1);
        }
        System.out.println("Map 1");
        System.out.println(map1);
        System.out.println("Map 2");
        System.out.println(map2);
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (map2.containsKey(key)) {
                int mincount = Math.min(value, map1.get(key));
                makeArray(key, mincount, res);
            }
        }
        int results[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            results[i] = res.get(i);
        }
        return results;
    }

    public static void main(String[] args) {
        int nums2[] = { 1, 2, 2, 1 }, nums1[] = { 2, 2 };
        int res[] = interSectionMethod(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
