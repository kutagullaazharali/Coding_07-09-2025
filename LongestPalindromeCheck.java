public class LongestPalindromeCheck {
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static String getLongestPalindrome(String str) {
        String longestPalindrome = null;
        int leng = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i;
                String curr = str.substring(i, j + 1);
                if (isPalindrome(curr)) {
                    if (len > leng) {
                        longestPalindrome = curr;
                        leng = len;
                    }
                }
            }
        }


        return longestPalindrome;
    }
    public static void main(String[] args) {
        String s = "babab";
        System.out.println("final output :" + getLongestPalindrome(s));
    }
}
