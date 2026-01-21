import java.util.Arrays;

public class MergeSortOrg {

    private static void mergeMethod(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int num1[] = new int[n1];
        int num2[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            num1[i] = nums[left + i];
        }

        for (int i = 0; i < n2; i++) {
            num2[i] = nums[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (num1[i] <= num2[j]) {
                nums[k++] = num1[i];
                i++;
            } else {
                nums[k++] = num2[j];
                j++;
            }
        }
        while (i < n1) {
            nums[k++] = num1[i++];
        }
        while (j < n2) {
            nums[k++] = num2[j++];
        }
    }

    private static void mergeSortMethod(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortMethod(nums, left, mid);
            mergeSortMethod(nums, mid + 1, right);
            mergeMethod(nums, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 4, 5 };
        System.out.println("Original Array : " + Arrays.toString(nums));
        mergeSortMethod(nums, 0, nums.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
