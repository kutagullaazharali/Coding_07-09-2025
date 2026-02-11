import java.util.*;

public class RemoveDuplicatesinString {
    public static void main(String[] args) {
        String s = "bcabc";
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set);
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}