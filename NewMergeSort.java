
import java.util.Arrays;

public class NewMergeSort {
    
    public static void main(String[] args) {

        int[] n1 = { 1, 3, 4, 6 };
        int[] n2 = { 2, 5, 7, 8 };

        int i = 0, j = 0;
        int[] res = new int[n1.length + n2.length];

        for (int k = 0; k < res.length && i < n1.length && j < n2.length; k++) {

            // If n1 is exhausted, take from n2
          //  if (i == n1.length) {
            //    res[k] = n2[j++];
            //}
            // If n2 is exhausted, take from n1
            //else if (j == n2.length) {
              //  res[k] = n1[i++];
            //}
            // Compare and take smaller element
             if (n1[i] < n2[j]) {
                res[k] = n1[i++];
            } else {
                res[k] = n2[j++];
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
