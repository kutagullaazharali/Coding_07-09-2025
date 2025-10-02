public class ReverseNumebr {
    public static int ReverseNumberMethod(int num) {
        int rev = 0;
        while(num!=0) {
            int last = num%10;
            rev = rev*10+last;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 123456;
        System.out.println("original Number : "+n);
        int output = ReverseNumberMethod(n);
        System.out.println("final output Number : "+output);
    }
}