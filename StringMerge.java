import java.util.*;
import java.util.List;

class StringMerge {
    public static void main(String args[]) {
        String list1[] = { "happy","sad","good" };
        String list2[] = { "sad","happy","good" };
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    map.put(list1[i], i + j);
                }
            }
        }
        System.out.println("Map   " + map);

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        System.out.println("Map   " + map);

        Collections.sort(list, (e1, e2) -> e1.getValue() - e2.getValue());
        ArrayList<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            min = Math.min(min, entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                res.add(entry.getKey());
            }
        }
        String output[] = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }
        System.out.println(res);
        System.out.println("Final Output : " + Arrays.toString(output));
    }
}