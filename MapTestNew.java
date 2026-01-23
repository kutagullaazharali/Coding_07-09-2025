import java.lang.reflect.Array;
import java.util.*;
class MapTestNew {
    public static void main(String[] args) {
        String s = "i i Azhar Ali";
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : s.split(" ")) {
            map.put(str,map.getOrDefault(str,0) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        String res[] = new String[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));
    }
}