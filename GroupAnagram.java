import java.util.*;

public class GroupAnagram {
    public static ArrayList<List<String>> getCom(String[] str) {

        Map<String, List<String>> map = new HashMap<>();
        for (String word : str) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            // map.putIfAbsent(key, new ArrayList<String>()); // Explicit type
            map.get(key).add(word);
        }

        return new ArrayList<List<String>>(map.values()); // Explicit type
    }

    public static void main(String[] args) {
        String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
        ArrayList<List<String>> s = getCom(str);
        System.out.println(s);
    }
}