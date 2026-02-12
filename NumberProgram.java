public class NumberProgram {
    public static void main(String[] args) {
        int n = 9123454;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        int temprev = rev;
        while (temprev != 0) {
            int digit = temprev % 10;
            int temp = rev;
            int count = 1;
            while (temp != 0) {
                int last = temp % 10;
                if (digit == last) {
                    count++;
                }
                temp /= 10;
            }
            if (count == 2) {
                System.out.println(digit);
                break;
            }
            temprev /= 10;
        }
    }
}