import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeBank {
    public static int numberOfBeams(String[] bank) {
        Map<Integer, Integer> map = new HashMap<>();
        int results = 0;
        for (int i = 0; i < bank.length; i++) {
            char c[] = bank[i].toCharArray();
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] == '1') {
                    count++;
                }
            }
            map.put(i, count);
        }
        // System.out.println(map);
        ArrayList<Integer> al = new ArrayList<>();
        for (int elem : map.values()) {
            if (elem >= 1) {
                al.add(elem);
            }
        }
        for (int i = 0; i < al.size()-1; i++) {
            results += al.get(i) * al.get(i+1);
        }
        System.out.println(al);
        return results;
    }
    public static void main(String[] args) {
        String str[] = { "011001", "000000", "010100", "001000" };
        System.out.println("final output : "+numberOfBeams(str));
    }
}
