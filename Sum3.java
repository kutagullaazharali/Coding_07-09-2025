
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {

    public static List<List<Integer>> threeSum(int[] num) {
        Set<List<Integer>> results = new HashSet();

        int n = num.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        List<Integer> temp = Arrays.asList(num[i], num[j], num[k]);
                        Collections.sort(temp);
                        results.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(results);

    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
