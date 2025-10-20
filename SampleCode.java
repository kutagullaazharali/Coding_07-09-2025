class SampleCode {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 1, 3, 5, 6, 7, 8 };
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != 0 && nums[i] == nums[j]) {
                    count++;
                    nums[j] = -1;
                }
            }
            if (nums[i] != -1) {
                System.out.println("Element : " + nums[i] + " - " + "Count : " + count);
            }
        }
    }
}