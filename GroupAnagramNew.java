import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;
import java.util.List;

class GroupAnagramNew {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
         Map<String,List<String>> map = new HashMap<>();
         for (int i = 0; i < strs.length; i++) {
             String temp = strs[i];
             char c[] = temp.toCharArray();
             Arrays.sort(c);
             String sb = new String(c);
             if (map.containsKey(sb)) {
                 map.get(sb).add(strs[i]);
             } else {
                 List<String> list = new ArrayList<String>();
                 list.add(strs[i]);
                 map.put(sb, list);
             }
         }
         List<List<String>> res = new ArrayList<List<String>>();
         for (Map.Entry<String, List<String>> entry : map.entrySet()) {
             res.add(entry.getValue());
         }
        System.out.println(res);
        System.out.println(map);
    }
}