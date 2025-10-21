
import java.util.*;
public class SearchInsertPosition {
    public static int SearchPosition(int num[], int target) {
        Arrays.sort(num);
        int left = 0;
        int rigth = num.length - 1;
        while (left <- rigth) {
            int mid = left + (rigth - left) / 2;
            if (num[mid] == target) {
                return mid;
            }
            else if (num[mid] < target) {
                left = mid + 1;
            }
            else {
                rigth = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[] ={1,3,5,6};
        int target = 5;
        int results = SearchPosition(n, target);
        System.out.println("final results : "+results);
    }
}
