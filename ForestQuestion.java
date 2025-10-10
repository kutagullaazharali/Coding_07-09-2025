import java.lang.reflect.Array;
import java.util.*;
public class ForestQuestion {
    public static int MaxKillCount(int[] arr) {
        int res[] = new int[arr.length];
        Arrays.sort(arr);
        int k = res.length-1;
        for(int i : arr) {
            res[k--] = i;
        }
        int elder = 0;
        int kill = 0;
        int total = 0;
        for(int ele : res)
        { 
            total+=ele;
        }
        for(int val : res) {
            elder += val;
            kill++; 
            if(elder> (total-elder)) {
                return kill;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,10};
        System.out.println(MaxKillCount(arr));
    }
}
