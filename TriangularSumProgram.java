import java.util.*;

public class TriangularSumProgram {
      public int triangularSum(int[] nums) {
        // Repeat until only one element is left
        while (nums.length > 1) {
            int[] newNums = new int[nums.length - 1];
            
            for (int i = 0; i < newNums.length; i++) {
                newNums[i] = (nums[i] + nums[i + 1]) % 10; // sum modulo 10
            }
            
            nums = newNums; // replace nums with the new array
        }
        
        return nums[0]; // final result
    }
    public static void main(String[] args) {
        TriangularSumProgram sol = new TriangularSumProgram();

        int[] nums = {1, 2, 3, 4, 5};
        int result = sol.triangularSum(nums);

        System.out.println("Triangular Sum: " + result);
    }
}
