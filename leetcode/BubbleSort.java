package leetcode;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int num[] = { 2, 1, 3, 4 };
        int n = num.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("final output : "+Arrays.toString(num));
    }
}
