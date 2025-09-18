
public class LongestPalindrome {
    public static boolean ispalindrome(String str) {
        int right = 0;
        int left = str.length() - 1;
        while (right < left) {
            if (str.charAt(right) != str.charAt(left)) {
                return false;
            }
            right++;
            left--;
        }
        return true;
    }

    public String longestPalindromemethod(String s) {
        int maxLength = 0;
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (ispalindrome(temp)) {
                    if (temp.length() > maxLength) {
                        word = temp;
                        maxLength = temp.length();
                    }

                }

            }
        }
        return word;
    }

    public static void main(String[] args) {
        String str = "cbb";
        LongestPalindrome obj = new LongestPalindrome();
        String res = obj.longestPalindromemethod(str);
        System.out.println("final output : " + res);
    }
}
