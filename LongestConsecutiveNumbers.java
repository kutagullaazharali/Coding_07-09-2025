import java.util.Collections;
import java.util.HashSet;

public class LongestConsecutiveNumbers {
    public static int getCountOfConsecutiveNumbers(int n[]) {
        int results = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : n) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int curretElement = num;
                while (set.contains(curretElement)) {
                    count++;
                    curretElement++;
                }
                results = Math.max(results, count);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 100, 200 };
        int output = getCountOfConsecutiveNumbers(n);
        System.out.println("final output : " + output);
    }
}
