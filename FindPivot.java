public class FindPivot {
    public static int pivotIndex(int[] nums) {
        int index = 0;
        int left = index-1;
        int right = nums.length;
        while (index != right) { 
            int sum1=0;
            for(int i=0; i<index; i++) 
            {
                sum1 +=nums[i];
            }

            int sum2 = 0 ;
            for(int i = index+1; i<nums.length; i++) {
                sum2 += nums[i];
            }
           if(sum1 == sum2){
            return index;
           }
            index++;
        }
        //  System.out.println("sum 1 : "+sum1);
        //     System.out.println("sum 2 : "+sum2);
        if(index==nums.length-1){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        int res = pivotIndex(arr);
        System.out.println("final output : "+res);
    }
}
