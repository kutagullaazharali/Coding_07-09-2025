import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int n1[][] = { { 1, 3 }, { 2, 2 }, { 4, 2 } };
        int n2[][] = { { 8, 4 }, { 2, 5 }, { 4, 6 } };
        Arrays.sort(n1[0]);
        Arrays.sort(n2[0]);
        System.out.println("n1 Array");
        for(int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n1[0].length; j++) {
                System.out.print("   " + n1[i][j]);
            }
            System.out.println();
        }
        System.out.println("n2 Array");
        for(int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[0].length; j++) {
                System.out.print("   " + n2[i][j]);
            }
            System.out.println();
        }
        

        
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                if (n1[i][0] == n2[j][0]) {
                    n1[j][1] = n1[i][1] + n2[j][1];
                }
            }
            System.out.println();
        }
        
        System.out.println("Modified n1 Array");
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n1[0].length; j++) {
                System.out.print("   "+n1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Modified n2 Array");
        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[0].length; j++) {
                System.out.print("   "+n2[i][j]);
            }
            System.out.println();
        }
    }
}