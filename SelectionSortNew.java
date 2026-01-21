import java.util.*;
class SelectionSortNew {
    public static void main(String[] args) {
        int n[] = { 2, 1, 4, 6, 3 };
        System.out.println("Before : " + Arrays.toString(n));
        for (int i = 1; i < n.length; i++) {
            int key = n[i];
            int j = i - 1;
            while (j >= 0 && n[j] > key) {
                n[j + 1] = n[j];
                j--;
            }
            n[j + 1] = key;
        }
        System.out.println("After : " + Arrays.toString(n));
    }
}