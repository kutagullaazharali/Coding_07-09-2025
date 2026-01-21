import java.util.*;

public class MergeSort2 {
    public static void main(String[] args) {
        int nums1[] = { 2, 1, 3, 5, 4 };
        int nums2[] = { 3, 5, 4, 7, 8 };
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int res[] = new int[nums1.length + nums2.length];
        System.out.println("Original Array : " + Arrays.toString(nums1));
        System.out.println("Original Array : " + Arrays.toString(nums2));
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[index++] = nums1[i];
                i++;
            } else {
                res[index++] = nums2[j];
                j++;
            }
        }
        while (i < nums1.length) {
            res[index++] = nums1[i++];
        }
        while (j < nums2.length) {
            res[index++] = nums2[j++];
        }
        System.out.println("Sorted Array : " + Arrays.toString(res));
    }
}
