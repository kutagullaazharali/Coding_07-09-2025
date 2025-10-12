import java.util.HashSet;
import java.util.*;
public class FirstRepeatedChar {
    public static void main(String[] args) {
        String s = "hello";
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                System.out.println("char : " + c);
                break;
            }
        }
    }
}
