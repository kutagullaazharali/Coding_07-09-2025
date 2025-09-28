public class LargestPermeterTriangle {

    public static int LargestPermeterTriangleMethod(int[] nums) {
        for(int i=nums.length-1; i>=2; i--) {
            if(nums[i] < nums[i-1]+nums[i-2]) {
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
    int arr[] = {2,1,2};
        int output = LargestPermeterTriangleMethod(arr);
        System.out.println("final output : "+output);
    }
}
