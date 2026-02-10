import java.util.*;

public class LeftAndRightSumDiff {
    public static void main(String[] args) {
        int nums[] = { 10, 4, 8, 3 };
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        for (int i = 0; i < leftSum.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < leftSum.length; j++) {
                temp += nums[j];
            }
            leftSum[i] = temp;
        }
        System.out.println(Arrays.toString(leftSum));

        for (int i = leftSum.length - 1; i >= 0; i--) {
            int tempNew = 0;
            for (int j = i - 1; j >= 0; j--) {
                tempNew += nums[j];
            }
            rightSum[i] = tempNew;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        System.out.println(Arrays.toString(rightSum));

        System.out.println(Arrays.toString(nums));
    }

}
