import java.util.*;
public class ConsecutivesChar {
    public static void main(String[] args) {
        String s = "abcasd";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(map);
        int res = 0;
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            char key = en.getKey();
            int val = en.getValue();
           
            if (val > res) {
                res = val;
            }
             System.out.println(val);
        }
        System.out.println("final : "+ res);
    }
}
