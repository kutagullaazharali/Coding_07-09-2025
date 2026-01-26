import java.util.*;
import java.util.Set;

public class WENS {
    public static void main(String[] args) {
        String s = "NESWW";
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(x + " " + y);
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == 'N') {
                y++;
            }
            if (c == 'S') {
                y--;
            }
            if (c == 'E') {
                x++;
            }
            if (c == 'W') {
                x--;
            }
            String o = x + " " + y;
            if (set.contains(o)) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}