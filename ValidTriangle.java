import java.util.Arrays;

public class ValidTriangle {
    public int triangleNumber(int[] nums) {
        int total = 0;
        for(int i=nums.length-1; i>=2; i--) {
            int left = 0;
            int right = i-1;
            while(left < right) {
                if(nums[left]+nums[right] > nums[i]){
                    total+=(right-left);
                    right--;
                }
                else {
                    left++;
                }
            }
        } 
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4};
        Arrays.sort(arr);
        ValidTriangle v = new ValidTriangle();
        int res = v.triangleNumber(arr);
        System.out.println("final output : "+res);

    }
}
