
import java.util.*;
import java.lang.*;
import java.lang.Math;

class JumpGameNew {
    static public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int n = nums.length - 1;
        int maxLen = 0;
         for (int i = 0; i < nums.length; i++) {
           if(i > maxLen) {
                return false;
           }
           maxLen = Math.max(maxLen, nums[i] + i);
            if (maxLen >= n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {3,0,8,2,0,0,1 };
        System.out.println(canJump(nums));
    }
}