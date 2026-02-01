import java.util.*;
import java.util.ArrayList;

class LeetCodeNums {
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
        int nums[] = { 10, 3, 1, 1 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        System.out.println(list);
        int first = list.get(0);

        System.out.println(first);

        list.remove(0);


        System.out.println(list);
        int x = 2;
        int sec =0;
        while (x > 0) {
            sec += getMin(list);
            x--;
        }
        System.out.println("Second : "+sec);
    }
}