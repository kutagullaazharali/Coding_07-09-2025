package leetcode;

import java.util.Arrays;

public class SortingTechnic {
    public static void swap(int num[], int start, int end) {
        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;
    }
    public static void main(String[] args) {
        int n[] = { 0, 2, 0, 1, 2, 1 };
        System.out.println("Originla Array : " + Arrays.toString(n));
        int i = 0;
        int twoPointer = n.length - 1;
        int zeroPointer = 0;
        while (i <= twoPointer) {
            if (n[i] == 0) {
                swap(n, i, zeroPointer);
                i++;
                zeroPointer++;
            }
            else if (n[i] == 2) {
                swap(n, i, twoPointer);
                twoPointer--;
            }
            else {
                i++;
            }
        }
        System.out.println("After Sorted Array : " + Arrays.toString(n));

    }
}
