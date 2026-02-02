import java.util.*;
public class KLargestCount {
    public static void main(String args[]) {
        int num[] = {2,2,2,2,2,2,1, 1, 1, 2, 2, 3 };
        int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : num) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());     
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        System.out.println(list);
        int res[] = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
