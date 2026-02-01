import java.awt.RenderingHints;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Characters;

public class SortCharacterByFreq {
    public static void main(String[] args) {
        String s = "cccaaa";
        // eert
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, map.get(c));
        }
        ArrayList<List<Character>> buckets = new ArrayList<>();
        System.err.println(map);
        System.err.println(buckets);
        for (int i = 0; i <= maxCount; i++) {
            buckets.add(new ArrayList<Character>());
        }
        System.err.println(buckets);
        for (Character key : map.keySet()) {
            int val = map.get(key);
            System.out.print("Val : " + val);
            System.out.println("  Key : " + key);
            buckets.get(val).add(key);
        }
        System.out.println("test");
        System.out.println(buckets);
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.size() - 1; i >= 1; i--) {
            for (Character c : buckets.get(i)) {
                for (int j = 0; j <= i; j++) {
                    sb.append(c);
                }
                System.out.print(c + " ");
            }
            System.out.println();
        }
         System.out.println(sb);
    }
}