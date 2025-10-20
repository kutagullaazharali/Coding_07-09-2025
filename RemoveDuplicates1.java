import java.util.*;
public class RemoveDuplicates1 {
    public static void uniqueElements(int num[]) {
        int j = 0;
        for (int i = 1; i<num.length; i++) {
            if (num[i] != num[j]) {
                j++;
                num[j] = num[i];
            }
        }
        for (int k = 0; k <= j; k++) {
            System.out.println("Elements : "+num[k]);
        }
        
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 1, 2, 8 };
        Arrays.sort(nums);
        uniqueElements(nums);
    }
}
