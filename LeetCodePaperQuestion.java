
import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCodePaperQuestion {
    public static int hIndex(int[] citations) {
        int results = 0;
        Arrays.sort(citations);
        for (int i = 1; i <= citations.length; i++) {
            int count = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] > i) {
                    count++;
                }
            }
            results = Math.max(count, results);
        }
    return results;
    }
    public static void main(String[] args) {
        int nums[] = { 3, 0, 6, 1, 5 };
        int Output = hIndex(nums);
        System.out.println("final output : " +Output);
    }
}
