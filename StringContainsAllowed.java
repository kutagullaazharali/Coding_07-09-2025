import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class StringContainsAllowed {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i) + "");
        }
        int count = 0;
        for (String s : words) {
            boolean bol = true;
            for (int i = 0; i < s.length(); i++) {
                String k = s.charAt(i) + "";
               
                if (!set.contains(k)) {
                    bol = false;
                    break;
                }
            }
            if (bol) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringContainsAllowed obj = new StringContainsAllowed();
        String s[] = { "ad", "bd", "aaab", "baa", "badab" };
        String allow = "ab";
        int res = obj.countConsistentStrings(allow, s);
        System.out.print(res);
    }
}