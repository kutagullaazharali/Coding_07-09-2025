import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate1 {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder q = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                q.append(c);
            }
        }
        System.out.println("final output : "+q);
    }
}
