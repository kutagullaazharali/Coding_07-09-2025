
import java.lang.reflect.Array;
import java.util.*;

public class TwoStringAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println("final output : " + Arrays.equals(c1, c2));
    }
}

