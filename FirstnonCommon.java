
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstnonCommon {
    public static void main(String[] args) {
        int num = 10102900;
        int temp = num;
        int count = 0;
        String s = "";
        while (num != 0) {
            s += num % 10;
            count++;
            num /= 10;
        }
        System.out.println(s);
        int arr[] = new int[count];
        int index = 0;
        for (int i = count - 1; i >= 0; i--)
            arr[index++] = (int) s.charAt(i) - '0';
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        for (int i = 0; i < count; i++) {
            int countn = 0;
            for (int j = i + 1; j < count; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    countn++;
                }
            }
            if (countn == 0) {
                System.out.println(arr[i]);
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(-1);
    }
}