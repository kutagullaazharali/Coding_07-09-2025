public class FindElementIndex {
    public  int SumMethod(int []nums,int n) {
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == n) {
                return i;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        FindElementIndex obj =  new FindElementIndex();
        int arr[]  = {1,2,3,4,5,6};
        int target = 6;
        int results = obj.SumMethod(arr,target);
        System.out.println("final method index : "+results );
    }
}
