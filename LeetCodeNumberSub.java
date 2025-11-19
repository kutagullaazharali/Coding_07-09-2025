public class LeetCodeNumberSub {
    public static int subtractMethod1(int n1, int n2) {
        int res = 0;
        while (n1 != 0 && n2 != 0) {
            res += n1 / n2;
            n1 %= n2;
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;
        int output = subtractMethod1(num1, num2);
        System.out.println("final output : " + output);
    }
}
