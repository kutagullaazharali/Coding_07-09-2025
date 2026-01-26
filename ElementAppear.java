import java.util.*;
class ElementAppear {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 2, 3, 3, 3, 3, 5 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int len = nums.length / 4;
        System.out.println("25% len : " + len);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val > len) {
                System.out.println(entry.getKey()+" : more then 25% : " + val);
            }

        }
    }
}