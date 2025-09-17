import java.util.Arrays;

public class RemoveElement {
    public int RemoveElementMethod(int nums[], int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4 };
        int target = 1;
        RemoveElement obj = new RemoveElement();
        int k = obj.RemoveElementMethod(arr, target);
        System.out.println("final output : " + Arrays.toString(Arrays.copyOfRange(arr, 0, k)));
    }
}