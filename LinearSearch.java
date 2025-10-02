public class LinearSearch {
    public static int LinearSearch(int arr[],int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,3,4,4,5,10};
        int key = 10;
        int res = LinearSearch(arr,key);
        System.out.println(res!=-1 ? "Found" : "not found");
    }
}
