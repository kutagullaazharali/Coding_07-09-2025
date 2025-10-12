public class Palindrome3 {
    public static boolean checkPalindrome(String s) {
        String sb = new StringBuilder(s).reverse().toString();
        return s.equals(sb);
    }

    public static void main(String[] args) {
        String s = "mam";
        System.out.println(checkPalindrome(s));
    }
}
