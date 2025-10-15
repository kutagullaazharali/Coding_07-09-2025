
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int n[] = { 1, 2, 4, 5, 6 };
        Arrays.sort(n);
        int len = n[n.length-1];
        int finalRes = len * (len + 1) / 2;
        System.out.println("final length : " + finalRes);
        for (int i : n) {
            finalRes -= i;
        }
        System.out.println("final Result : "+finalRes);
    }
}
