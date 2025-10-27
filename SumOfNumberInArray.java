
import java.util.*;
public class SumOfNumberInArray {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4 };
        Arrays.sort(n);
        int a = n[0];
        int b = n[1];
        for (int i = 2; i < n.length; i++) {
            if (n[i] > a) {
                b = a;
                a = n[i];
            } else if (n[i] > b) {
                b = n[i];
            }
        }
        System.out.println("max element 1 : " + a);
        System.out.println("max element 2 : " + b);
    }
}
