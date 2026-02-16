import java.util.Arrays;

public class TwoSumSortedArray {
    static public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[] { left + 1, right + 1 };
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int num[] = { 2, 7, 11, 15 }, target = 9;
        int res[] = twoSum(num, target);
        System.out.println(Arrays.toString(res));
    }
}