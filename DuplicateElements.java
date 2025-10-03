
import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6,6};
        Map<Integer,Integer> map =  new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) { 
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            if(val>1) {
                System.out.println("key : "+key + " value : "+val);
            }
        }
    }
}
