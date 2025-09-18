
import java.util.Arrays;

public class MergeArray {
    public int[] mergeArraymethod(int[] nums1, int n, int nums2[], int m) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums2[j];
                i--;
                j--;
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        return nums1;
    }

    public static void main(String[] args) {
        MergeArray obj = new MergeArray();
        int num1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int num2[] = { 4, 5, 6 };
        int n = 3;
        int res[] = obj.mergeArraymethod(num1, m, num2, n);
        System.out.println("final array : " + Arrays.toString(res));

    }
}
