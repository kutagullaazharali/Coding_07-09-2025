public class FindMinElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int minElement = arr[0];
        for(int i = 1;i<arr.length;i++) {
            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        System.out.println("final maximum Element : "+minElement);
    }
}
