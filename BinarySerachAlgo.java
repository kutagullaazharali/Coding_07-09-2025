public class BinarySerachAlgo {
    public static int BinarySearch(int[] arr,int key) {
        int left = 0;
        int rigth = 0;
        while(left<rigth) {
            int mid = (left+rigth)/2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid]>key) { 
                left = mid+1;
            }
            else {
                rigth = mid - 1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,3,4,4,5,10};
        int key = 10;
        int res = BinarySearch(arr,key);
        System.out.println(res);
        System.out.println(res!=-1 ? "Found" : "not found");
    }
}
