import java.util.ArrayList;
import java.util.List;

class Backtracking {
    public static void backtrack(int index, int nums[], List<Integer> current, List<List<Integer>> res) {
        res.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);   
            backtrack(i + 1, nums, current, res);
            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> get(int[] num) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(0, num, new ArrayList<>(), results);
        return results;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2 };
        System.out.println(get(n));
    }
}