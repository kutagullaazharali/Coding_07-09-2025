import java.util.*;

public class FindcommonCharacters {
    public static void main(String[] args) {

        String words[] = { "cool", "lock", "cook" };

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            char c = words[0].charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {

            String s = words[i];

            Map<Character, Integer> tempMap = new HashMap<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            Iterator<Character> it = map.keySet().iterator();

            while (it.hasNext()) {
                char c = it.next();

                if (tempMap.containsKey(c)) {
                    int min = Math.min(map.get(c), tempMap.get(c));
                    map.put(c, min);
                } else {
                    it.remove();
                }
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (char c : map.keySet()) {
            int count = map.get(c);
            while (count-- > 0) {
                result.add(String.valueOf(c));
            }
        }

        System.out.println(result);
    }
}