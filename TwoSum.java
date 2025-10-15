import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
public class TwoSum {
    public static int[] CheckSum(int num[], int targer) {
        int output[] = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == targer) {
                    output[0] = i + 1;
                    output[1] = j + 1;
                }
            }
        }
        return output;
    }
    
    public static int[] CheckSum1(int num[], int targer) {
        Map<Integer, Integer> map = new HashMap<>();

        int output[] = new int[2];
        for (int i = 0; i < num.length; i++) {
            int remainder =  targer - num[i]; 
            if (map.containsKey(remainder)) {
                return new int[] { map.get(remainder)+1,1+i};
            }
            map.put(num[i], i);
        }
        return output;
    }
    public static void main(String[] args) {
        int n[] = { 11, 15, 2, 7 };
        int target = 9;
        // int res[] = CheckSum(n, target);
        int res1[] = CheckSum1(n,target);
        // System.out.print(Arrays.toString(res));
        System.out.println(Arrays.toString(res1));

    }
}
