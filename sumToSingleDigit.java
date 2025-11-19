public class sumToSingleDigit {
    public static int sumToSingleDigit(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        while (sum > 9) {
            int temp = sum;
            sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        return  sum;
    }
    public static void main(String[] args) {
        System.out.println(sumToSingleDigit(10, 20, 30)); // Output: 6
        System.out.println(sumToSingleDigit(999));   
    }
}
