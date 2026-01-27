import java.lang.reflect.Array;
import java.util.ArrayList;

public class SelfDividingNumbers {
    public static boolean getSign(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            al.add(temp % 10);
            temp /= 10;
            count++;
        }
        int c = 0;
        for (int x : al) {
            if (x == 0 || n % x != 0) {
                return false;
            }
            if (n % x == 0) {
                c++;
            }
        }
        return c == count ? true : false;
    }
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (getSign(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
