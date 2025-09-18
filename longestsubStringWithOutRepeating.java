
import java.util.HashSet;
import java.util.Set;

public class longestsubStringWithOutRepeating {
    public static void longestSubstringfindMethod(String str) {
        int j = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            while (set.contains(str.charAt(i))) {
                set.remove(str.charAt(j));
                j++;
            }
            set.add(str.charAt(i));

            maxLength = Math.max(maxLength, i - j + 1);
        }
        System.out.println("final maxLength : " + maxLength);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        longestSubstringfindMethod(s);
    }
}
