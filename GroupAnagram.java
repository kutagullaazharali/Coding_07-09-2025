import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char ar[] = s.toCharArray();
            Arrays.sort(ar);
            String key = new String(ar);
            map.computeIfAbsent(key, item -> new ArrayList<>()).add(s);
        }
        System.out.println("final output : " + map);
        List<List<String>> results = new ArrayList<>(map.values());
        System.out.println("final results : " + results);
    }
}
