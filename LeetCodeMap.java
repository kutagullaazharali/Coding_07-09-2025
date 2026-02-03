import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class LeetCodeMap {
    public static void main(String[] args) {
        int []rec1 = {0,0,2,2};
        int[] rec2 = { 1, 1, 3, 3 };
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < rec1.length; i++) {
            map.put(rec1[i], map.getOrDefault(rec1[i],0) + 1);
        }
        for (int i = 0; i < rec2.length; i++) {
            map.put(rec2[i], map.getOrDefault(rec2[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        System.out.println();
        System.out.println(map);
    }
}
