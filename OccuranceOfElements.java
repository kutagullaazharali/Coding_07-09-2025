import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceOfElements {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map =  new HashMap<Integer,Integer>();
        for(int i  = 0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else map.put(arr[i],1);
        }
        System.out.println("final output : "+map);
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer val = entry.getValue();
            set.add(val);
            count++;
        }
        if(set.size() ==  count) { 
            return true;
        } else {
            return false;
        }
    }   

    public static void main(String[] args) {
    int arr[] =  {-3,0,1,-3,1,1,1,-3,10,0};
    System.out.println("final output : "+uniqueOccurrences(arr));
    }
}
