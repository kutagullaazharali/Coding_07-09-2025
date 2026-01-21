import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Zerosprogramnew {
public static void main(String[] args) {
        int n[] = { 1, 0, 0, 1, 0, };
        System.out.println("original array :" + Arrays.toString(n));
        int left = 0;
        int right = n.length-1;
        while (left < right) {
            while (left < right && n[left] == 0) {
                left++;
            }
            while (right > 0 && n[right] == 1) {
                right--;
            }
            if (left < right) {
                int temp = n[left];
                n[left] = n[right];
                n[right] = temp;
            }
        }
        System.out.println("Modified array :" + Arrays.toString(n));
    }
}