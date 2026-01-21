import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {
        int n[] = { 1, 1, 3, 3, 2, 2,4 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            map.put(n[i], map.getOrDefault(n[i], 0)+1);
        }
        System.out.println(map);
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);
    }
}
