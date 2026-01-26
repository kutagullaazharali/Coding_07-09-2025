class ContainerWithMoreWater {
    public static int getMax(int nums[]) {
        int res = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int height = (right - left) * Math.min(nums[left], nums[right]);
            res = Math.max(res, height);

            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int output = getMax(height);
        System.out.println("final output : " + output);
    }
}