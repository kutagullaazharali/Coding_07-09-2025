import java.util.*;
import java.lang.Math.*;

class LongestCharacter {
    public static void main(String[] args) {
        String s = "pwwkew";
        Set<Character> Set = new HashSet<>();
        int output = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (Set.contains(s.charAt(i))) {
                Set.remove(s.charAt(j));
                j++;
            }
            Set.add(s.charAt(i));
            System.out.println(i - j + 1);
            output = Math.max(output, i - j + 1);
        }
        System.out.println(output);
    }
}