import java.util.Arrays;

public class DuplicateCount {
    public static int getCountMethod(int num[]) {
        if (num.length < 1) {
            return num.length;
        }
        int i = 1;
        int j = 0;
        while (i < num.length) {
            if (num[i] == num[j]) {
                i++;
            }
            else {
                j++;
                num[j] = num[i];
                i++;
            }
            System.out.println(Arrays.toString(num));
        }
        return j+1;
    }
    public static void main(String[] args) {
        int n[] = { 1, 2, 2, 3, 3, 4, 5, 6, 7, 8 };
        System.out.println(getCountMethod(n));
    }
}