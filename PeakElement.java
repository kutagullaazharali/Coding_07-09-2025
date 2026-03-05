class PeakElement {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        int i = 0;
        int j = nums.length - 1;
        int n = nums.length;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        while (j > 0 && nums[j - 1] > nums[j]) {
            j--;
        }
        System.out.println(i);
        System.out.println(j);
    }
}