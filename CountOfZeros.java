public class CountOfZeros {
    public static int CountOfZeros(int nums[]) {
        int count = 0;
        for(int i:nums) {
            if(i==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0,0,2};
        int results = CountOfZeros(arr);
        System.out.println("final count of zeros : "+results);
    }
}
