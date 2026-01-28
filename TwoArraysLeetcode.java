import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoArraysLeetcode {
    static public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Count occurrences of elements in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Add elements according to arr2 order
        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count-- > 0) {
                    list.add(num);
                }
                map.remove(num); // remove from map after processing
            }
        }

        // 3. Add remaining elements (not in arr2) sorted ascending
        ArrayList<Integer> remaining = new ArrayList<>(map.keySet());
        remaining.sort(null); // sort ascending
        for (int num : remaining) {
            int count = map.get(num);
            while (count-- > 0) {
                list.add(num);
            }
        }

        // 4. Convert list to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int arr2[] = { 2, 1, 4, 3, 9, 6 };

        int results[] = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(results));
    }
}