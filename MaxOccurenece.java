
import java.util.Set;
import java.util.HashSet;

class MaxOccurence {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int rigth = 0; rigth < s.length(); rigth++) {
            if (set.contains(s.charAt(rigth))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(rigth));
            max = Math.max(max, rigth - left + 1);
        }
        System.out.println("max length : " + max);
    }
}