
import java.util.Arrays;

public class RemoveDuplicates {
    public int RemoveDuplicatesMethod(int nums[]) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3 };
        System.out.println("original array : " + Arrays.toString(arr));
        RemoveDuplicates obj = new RemoveDuplicates();
        int len = obj.RemoveDuplicatesMethod(arr);
        System.out.println("Final Output : " + len);
        System.out.println("original array : " + Arrays.toString(arr));
    }
}
