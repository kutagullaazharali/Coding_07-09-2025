import java.util.*;
import java.util.ArrayList;

class LeetCodeNumsNew {
    public static int getMin(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        int mincount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                mincount = i;
            }
        }
        list.remove(mincount);
        return min;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 12 };
        int first = nums[0];
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (min1 > nums[i]) {
                min2 = min1;
                min1 = nums[i];
            } else if (min2 > nums[i] && nums[i] != min1) {
                min2 = nums[i];
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }
    
}