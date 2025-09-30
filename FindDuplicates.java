import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int val = nums[i];
          if(map.containsKey(val) && i- map.get(val) <=k) {
            return true;
          }
          map.put(val, i);
        }
        return false;
    }
    public static void main(String[] args) {
        FindDuplicates obj = new FindDuplicates();
        int nums[] = {1,2,3,1};
        int k = 3;
        boolean res = obj.containsNearbyDuplicate(nums,k);
        System.out.println("final results : "+res);
    }
}
