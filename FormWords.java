import java.util.*;

public class FormWords {
    public static void main(String[] args) {
        String[] arr = { "hello", "world", "leetcode" };
        String chars = "welldonehoneyr";
        int length = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("Main : " + map);
        for (String s : arr) {
            Map<Character, Integer> temp = new HashMap<>();
            for (char ch : s.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }
            int count = 0;
            int len = 0;
            for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
                char ch = entry.getKey();
                int val = entry.getValue();
                len += val;
                if (map.containsKey(ch)) {
                    int compareval = map.get(ch);
                    if (compareval >= val) {
                        count++;
                    }
                }
            }
            if (count == temp.size()) {
                System.out.println("Count : " + count);
                length += len;
            }
            System.out.println(temp);

        }
        System.out.println(length);
    }
}