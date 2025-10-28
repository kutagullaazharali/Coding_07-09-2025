
import java.util.Arrays;

public class LeetCodeQuestionZeros {
    public static int getValueMethod(int nums[]) {
        int n = nums.length;
        int output = 0;
        int left = 0;
        int rigth = Arrays.stream(nums).sum();
        for (int i = 0; i < n; i++) {
            rigth -=nums[i];
            left += nums[i];
            if (nums[i] != 0) {
                continue;
            }
            if (rigth == left) {
                output += 2;
            }
            if (Math.abs(rigth - left)==1) {
                output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int n[] = { 1, 0, 2 };
        int results = getValueMethod(n);
        System.out.println("final output : "+results);
    }
}
