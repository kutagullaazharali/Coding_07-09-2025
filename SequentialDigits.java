
import java.lang.reflect.Array;
import java.util.*;

class SequentialDigits {
    public static void main(String[] args) {
        int low = 100, high = 300;
        String sub = "123456789";
        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();
        ArrayList<Integer> list = new ArrayList<>();
        for (int left = lowLength; left <= highLength; left++) {
            for (int right = 0; right <= sub.length() -3 ; right++) {
                String ran = sub.substring(right, right + left);
                int num = Integer.parseInt(ran);
                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }
        System.out.println(list);
    }
}