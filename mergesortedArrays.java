import java.util.Arrays;

public class mergesortedArrays {
    public static void main(String[] args) {
        int n1[] = { 1, 3, 4, 6 };
        int n2[] = {2,5,7,8};
        int i = 0;
        int j = 0;
        int k = 0;
        int res[] = new int[n1.length+n2.length];
        while (i < n1.length && j < n2.length) {
            if (n1[i] < n2[j]) {
                res[k++] = n1[i];
                i++;
            } else {
                res[k++] = n2[j];
                j++;
            }
        }
        while (i < n1.length) {
            res[k++] = n1[i++];
        }
        while (j < n2.length) {
            res[k++] = n2[j++];
        }
        
        System.out.println(Arrays.toString(res));
    }
}
