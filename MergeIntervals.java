
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> al = new List<>();
        for(int i=0; i<intervals.length-1;i++) {

            int temp[] = intervals[i];
            int temp1[] = intervals[i+1];
                // [[1,4],[4,5]]
                int a1= temp[0];
                int a2= temp[1];
                int b1= temp1[0];
                int b2= temp1[1];
            if(b1<=a2 && a1<=b2) {
            }

        }
        return new int[0][0];
    }
    public static void main(String args[]) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        MergeIntervals mi = new MergeIntervals();
        int res[][] = mi.merge(arr);
        System.out.println("final outout : "+Arrays.toString(res));
    }
}
