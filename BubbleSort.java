
import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSortMethod(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1;j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};
        System.out.println("original Array : "+Arrays.toString(arr));
        BubbleSortMethod(arr);
        System.out.println("sorted array : "+Arrays.toString(arr));
    }
}
