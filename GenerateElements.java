
import java.util.ArrayList;
import java.util.Arrays;

public class GenerateElements {
        public int[] decompressRLElist(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<nums.length; i+=2) {
                int freq = nums[i];
                int val = nums[i+1];
                for(int j=0; j<freq; j++) {
                    list.add(val);
                }
            }
            int arr[] = new int[list.size()];
            int k = 0;
            for(int i : list) {
                arr[k++] = i;
            }
            return arr;
        }

    public static void main(String[] args) {
        GenerateElements obj = new GenerateElements();
        int nums[] = {1,2,3,4};
        int res [] = obj.decompressRLElist(nums);
        System.out.println("final output : "+Arrays.toString(res));
    }
}
