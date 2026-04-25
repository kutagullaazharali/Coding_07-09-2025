public class minLensubstringsum {
    public static void main(String args[]) {
        // int nums[] = { 2, 3, 1, 2, 4, 3 };
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        int n = nums.length;
        int target = 7;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (minLen != Integer.MAX_VALUE) {
            System.out.print(minLen);
        } else {
            System.out.print(0);
        }
    }
}
