public class ReverseInteger {
    public static void main(String[] args) {
        int n = 123;
        ReverseInteger obj = new ReverseInteger();
        int results = obj.reverseMethod(n);
        System.out.println("Final Output : " + results);
    }

    public int reverseMethod(int num) {
        int res = 0;
        while (num != 0) {
            int last = num % 10;
            num /= 10;
            res = res * 10 + last;
        }
        return res;
    }
}
