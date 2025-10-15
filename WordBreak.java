import java.util.*;
import java.util.List;

public class WordBreak {
    public static boolean checkBreakMethod(List<String> str, String s) {
        boolean bol[] = new boolean[s.length()+1];
        Set<String> wordSet = new HashSet<String>(str);
        bol[0] = true; 
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (bol[j] && wordSet.contains(s.substring(j, i))) 
                {
                    bol[i] = true;
                    break;
                }
            }
        }
        return bol[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> list = Arrays.asList("leet", "code");
        System.out.println(checkBreakMethod(list,s));
    }
}
