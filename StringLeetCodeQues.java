import java.util.*;

public class StringLeetCodeQues {
    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String banned[] = { "hit" };

        String arr[] = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            temp = temp.replaceAll("[^a-zA-Z0-9]", "")
                    .toLowerCase()
                    .trim();

            if (temp.length() == 0 || temp.equals(banned)) {
                continue;
            }

            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        for (String s : banned) {
            map.remove(s);
        }
        System.out.println("Map : " + map);

        ArrayList<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (e1, e2) -> map.get(e2) - map.get(e1));

        System.out.println("Sorted words : " + list);
    }
}
