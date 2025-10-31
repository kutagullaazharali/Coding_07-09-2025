import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeOccuranceOfElements {
    public static int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println("final output :" + map);
        ArrayList<Integer> al = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (v >= 2) {
                al.add(k);
                System.out.println(k);
            }
        }
        int number[] = new int[al.size()];
        int k = 0;
        System.out.println("k ");
        for (int n : al) {
            number[k] = n;
            k++;
            System.out.println("number : "+n);
        }
        System.out.println(Arrays.toString(number));
        return number;
    }

    public static void main(String[] args) {
        int n[] = { 0, 1, 1, 0 };
        getSneakyNumbers(n);
    }
}
