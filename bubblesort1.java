import java.util.*;
public class bubblesort1 {
    public static void main(String[] args) {
        //   int num[] = { 1, 3, 2, 5, 4 };
        //int num[] = { 5, 1, 4, 2, 8 };
        int num[] = { 9, 7, 5, 3, 1 };

        System.out.println("Original Array : "+Arrays.toString(num));
    for(int i = 0;i<num.length-1;i++)
    {
        for (int j = 0; j < num.length - i - 1; j++) {
            if (num[j] > num[j+1]) {
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
    }
    System.out.println("Sorted Array : "+Arrays.toString(num));
    }
}