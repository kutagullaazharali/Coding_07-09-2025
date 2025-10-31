import java.util.HashSet;
import java.util.*;
public class FindLargestNumber {
    public static void main(String[] args) {
        int n[] = { 2, 3, 4, 5, 6, 9 };
        int k = 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n.length; i++) {
            set.add(n[i]);
        }
        System.out.println("set : "+set);
    }
}
