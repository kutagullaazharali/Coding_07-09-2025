import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeQuestionOccurence {
    public static int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                al.add(nums[i]);
            }
        }
        System.out.println(al);
        int numbers[] = new int[al.size()];
        int k = 0;
        for (int v : al) {
            numbers[k] = v;
            k++;
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public static void main(String[] args) {
        int n[] = { 0, 1, 1, 0 };
        getSneakyNumbers(n);
    }
}
