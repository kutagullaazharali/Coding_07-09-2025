import java.util.*;
public class ThreeSumClosest {
    public static int threeSumClosest(int num[], int target) {
        Arrays.sort(num);
        int clostSum = num[0] + num[1] + num[2];
        for (int i = 0; i < num.length - 2; i++) {
            int left = i+1;
            int rigth = num.length - 1;
            while (left < rigth) {
                int sum = num[i] + num[left] + num[rigth];
                if (Math.abs(target - sum) < Math.abs(target - clostSum)) {
                    clostSum = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    rigth--;
                } else {
                    return sum;
                }
            }
        }
        return clostSum;
    }

    public static void main(String[] args) {
        int[] nums2 = { 0, 1, 2 };
        int target2 = 0;
        System.out.println("Closest sum to " + target2 + " is: " + threeSumClosest(nums2, target2));
    }
}
