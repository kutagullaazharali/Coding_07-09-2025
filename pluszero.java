
import java.util.Arrays;

public class pluszero {
    public static int[] pluszeroMethod(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int results[] = new int[arr.length + 1];
        results[0] = 1;
        return results;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 1, 9 };
        int Output[] = pluszeroMethod(arr);
        System.out.println("final output : " + Arrays.toString(Output));

    }
}
