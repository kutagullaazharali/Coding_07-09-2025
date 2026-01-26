import java.util.Arrays;
import java.util.*;
public class SumArrayExpectSelf {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int results[] = new int[nums.length];
        System.out.println("inital array : " + Arrays.toString(results));
        for (int i = 0; i < nums.length; i++) {
            int tempval = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    tempval = tempval * nums[j];
                }
            }
            results[i] = tempval;
        }
         System.out.println("final array : " + Arrays.toString(results));
    }
}
