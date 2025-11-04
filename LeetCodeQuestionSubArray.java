import java.util.*;  
import java.util.Map;  
import java.util.HashMap;  
import java.util.List;  
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.Set;  
import java.util.HashSet;

public class LeetCodeQuestionSubArray {

    public static int method(int[] nums, int k, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // higher frequency first
            } else {
                return b.getKey() - a.getKey(); // if tie, higher number first
            }
        });

        // Step 3: Pick top x elements
        Set<Integer> topElements = new HashSet<>();
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            if (count == x)
                break;
            topElements.add(entry.getKey());
            count++;
        }

        // Step 4: Calculate sum of only those elements present in topElements
        int sum = 0;
        for (int num : nums) {
            if (topElements.contains(num)) {
                sum += num;
            }
        }

        return sum;
    }

    // Method to get all subarrays of size k and calculate their X-Sum
    public static int[] findXSum(int[] nums, int k, int x) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i + k <= nums.length; i++) {
            int[] newArr = Arrays.copyOfRange(nums, i, i + k);
            al.add(method(newArr, k, x));
        }

        // Convert ArrayList to int[]
        int[] results = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            results[i] = al.get(i);
        }
        return results;
    }

    // Main method
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3, 4, 2, 3 };
        int k = 6;
        int x = 2;

        int res[] = findXSum(nums, k, x);
        System.out.println("Final Output: " + Arrays.toString(res));
    }
}
