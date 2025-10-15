
import java.util.*;
class MissNumber1 {
    public static int findMissingNumber(int num[]) {
        Arrays.sort(num);
        int len = num[num.length-1];
        int finalRes = len * (len + 1) / 2;
        System.err.println("final res "+finalRes);
        for (int i : num) {
            finalRes -= i;
        }
        return finalRes;
    }
    public static void main(String[] args) {
        int n[] = { 1, 2, 4, 5};
        int res = findMissingNumber(n);
        System.out.println("final output : " + res);
    }
}